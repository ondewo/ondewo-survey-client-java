package com.ondewo.survey.stubs;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ondewo.survey.auth.BearerToken;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Server;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.ServiceDescriptor;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import ondewo.survey.FHIRGrpc;
import ondewo.survey.Fhir;
import ondewo.survey.SurveyOuterClass;
import ondewo.survey.SurveysGrpc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Exercises the generated gRPC service stubs: their descriptors, every stub flavour, and one
 * real request/response round trip over the in-process transport - no socket, no network, but
 * the real generated marshallers on both ends.
 */
class GeneratedServicesTest {

    /**
     * Number of {@code *Grpc} classes protoc must emit for this product: {@code
     * ondewo.survey.Surveys} from survey.proto and {@code ondewo.survey.FHIR} from fhir.proto.
     * Bump it when the api adds or drops a service - that is exactly the kind of silent
     * generator regression this test exists to catch.
     */
    private static final int EXPECTED_SERVICE_COUNT = 2;

    private static final Metadata.Key<String> AUTHORIZATION =
            Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);

    private final AtomicReference<Metadata> receivedHeaders = new AtomicReference<>();

    private Server server;
    private ManagedChannel channel;

    @BeforeEach
    void startServer() throws Exception {
        final SurveysGrpc.SurveysImplBase service =
                new SurveysGrpc.SurveysImplBase() {
                    @Override
                    public void getSurvey(
                            final SurveyOuterClass.GetSurveyRequest request,
                            final StreamObserver<SurveyOuterClass.Survey> responseObserver) {
                        responseObserver.onNext(
                                SurveyOuterClass.Survey.newBuilder()
                                        .setSurveyId(request.getSurveyId())
                                        .setDisplayName("served-" + request.getSurveyId())
                                        .setStatus(SurveyOuterClass.Survey.AgentStatus.UPDATED)
                                        .build());
                        responseObserver.onCompleted();
                    }
                };

        final ServerInterceptor headerCapture =
                new ServerInterceptor() {
                    @Override
                    public <Q, S> ServerCall.Listener<Q> interceptCall(
                            final ServerCall<Q, S> call,
                            final Metadata headers,
                            final ServerCallHandler<Q, S> next) {
                        receivedHeaders.set(headers);
                        return next.startCall(call, headers);
                    }
                };

        final String name = InProcessServerBuilder.generateName();
        server =
                InProcessServerBuilder.forName(name)
                        .directExecutor()
                        .addService(ServerInterceptors.intercept(service, headerCapture))
                        .build()
                        .start();
        channel = InProcessChannelBuilder.forName(name).build();
    }

    @AfterEach
    void stopServer() throws Exception {
        channel.shutdownNow();
        server.shutdownNow();
        channel.awaitTermination(10, TimeUnit.SECONDS);
        server.awaitTermination(10, TimeUnit.SECONDS);
    }

    @Test
    void exposesTheExpectedServiceDescriptor() {
        final ServiceDescriptor descriptor = SurveysGrpc.getServiceDescriptor();

        final List<String> methods =
                descriptor.getMethods().stream()
                        .map(MethodDescriptor::getBareMethodName)
                        .collect(toList());

        assertEquals("ondewo.survey.Surveys", descriptor.getName());
        assertTrue(
                methods.containsAll(
                        List.of(
                                "CreateSurvey",
                                "GetSurvey",
                                "UpdateSurvey",
                                "DeleteSurvey",
                                "ListSurveys")),
                "missing rpcs, got " + methods);
        assertEquals(MethodDescriptor.MethodType.UNARY, SurveysGrpc.getGetSurveyMethod().getType());
        assertEquals(
                "ondewo.survey.Surveys/GetSurvey",
                SurveysGrpc.getGetSurveyMethod().getFullMethodName());
    }

    /**
     * The second service of this product. It lives in fhir.proto but shares the proto package
     * and reuses survey.proto's request messages, so a generator that got the cross-file import
     * wrong would surface right here.
     */
    @Test
    void exposesTheSecondServiceDescriptor() {
        final ServiceDescriptor descriptor = FHIRGrpc.getServiceDescriptor();

        final List<String> methods =
                descriptor.getMethods().stream()
                        .map(MethodDescriptor::getBareMethodName)
                        .collect(toList());

        assertEquals("ondewo.survey.FHIR", descriptor.getName());
        assertEquals(
                List.of(
                        "CreateFHIRSurvey",
                        "GetFHIRSurveyAnswers",
                        "GetAllFHIRSurveyAnswers"),
                methods);

        // fhir.proto declares this rpc over survey.proto's request message and its own response
        // message. Pushing both through the generated marshallers of that method is what proves
        // the cross-file import survived generation.
        final SurveyOuterClass.GetSurveyAnswersRequest request =
                SurveyOuterClass.GetSurveyAnswersRequest.newBuilder()
                        .setSurveyId("projects/6a1b2c3d-0000-4000-8000-000000000000/agent")
                        .setUserId("caller-42")
                        .build();

        assertEquals(
                request,
                FHIRGrpc.getGetFHIRSurveyAnswersMethod()
                        .parseRequest(
                                FHIRGrpc.getGetFHIRSurveyAnswersMethod().streamRequest(request)));
        assertEquals(
                Fhir.SurveyFHIRAnswersResponse.getDefaultInstance(),
                FHIRGrpc.getGetFHIRSurveyAnswersMethod()
                        .parseResponse(
                                FHIRGrpc.getGetFHIRSurveyAnswersMethod()
                                        .streamResponse(
                                                Fhir.SurveyFHIRAnswersResponse
                                                        .getDefaultInstance())));
    }

    /**
     * Every generated service class, found on the compiled classpath rather than listed by
     * hand, so a service added to the api is picked up without touching this test.
     */
    @Test
    void everyGeneratedServiceHasAUsableDescriptor() throws Exception {
        final Path classesRoot =
                Paths.get(
                        SurveysGrpc.class
                                .getProtectionDomain()
                                .getCodeSource()
                                .getLocation()
                                .toURI());
        assertTrue(Files.isDirectory(classesRoot), "expected compiled classes at " + classesRoot);

        final List<String> serviceClasses;
        try (Stream<Path> tree = Files.walk(classesRoot)) {
            serviceClasses =
                    tree.filter(Files::isRegularFile)
                            .map(path -> classesRoot.relativize(path).toString())
                            .filter(name -> name.endsWith("Grpc.class"))
                            .map(name -> name.substring(0, name.length() - ".class".length()))
                            .map(name -> name.replace(java.io.File.separatorChar, '.'))
                            .sorted()
                            .collect(toList());
        }

        assertEquals(EXPECTED_SERVICE_COUNT, serviceClasses.size(), "found " + serviceClasses);

        for (final String className : serviceClasses) {
            final ServiceDescriptor descriptor =
                    (ServiceDescriptor)
                            Class.forName(className).getMethod("getServiceDescriptor").invoke(null);

            assertTrue(
                    descriptor.getName().startsWith("ondewo."),
                    className + " serves " + descriptor.getName());
            assertTrue(
                    descriptor.getMethods().iterator().hasNext(),
                    className + " declares no rpc");
        }
    }

    @Test
    void servesAUnaryCallOverTheGeneratedMarshallers() {
        final SurveysGrpc.SurveysBlockingStub stub =
                new BearerToken("s3cr3t").attachTo(SurveysGrpc.newBlockingStub(channel));

        final SurveyOuterClass.Survey survey =
                stub.getSurvey(
                        SurveyOuterClass.GetSurveyRequest.newBuilder()
                                .setSurveyId("projects/6a1b2c3d-0000-4000-8000-000000000000/agent")
                                .build());

        assertEquals("projects/6a1b2c3d-0000-4000-8000-000000000000/agent", survey.getSurveyId());
        assertEquals(
                "served-projects/6a1b2c3d-0000-4000-8000-000000000000/agent",
                survey.getDisplayName());
        assertEquals(SurveyOuterClass.Survey.AgentStatus.UPDATED, survey.getStatus());
        assertEquals("Bearer s3cr3t", receivedHeaders.get().get(AUTHORIZATION));
    }

    /**
     * The published library declares grpc-netty-shaded, so a consumer can open a channel from
     * a plain target string without adding a transport. Nothing is dialled: gRPC connects
     * lazily, on the first call.
     */
    @Test
    void buildsEveryStubFlavourAgainstAPlainTargetChannel() {
        final ManagedChannel dummy =
                ManagedChannelBuilder.forTarget("localhost:50051").usePlaintext().build();
        try {
            assertNotNull(SurveysGrpc.newBlockingStub(dummy));
            assertNotNull(SurveysGrpc.newFutureStub(dummy));
            assertNotNull(SurveysGrpc.newStub(dummy));
            assertNotNull(FHIRGrpc.newBlockingStub(dummy));
            assertNotNull(FHIRGrpc.newFutureStub(dummy));
            assertNotNull(FHIRGrpc.newStub(dummy));
        } finally {
            dummy.shutdownNow();
        }
    }
}
