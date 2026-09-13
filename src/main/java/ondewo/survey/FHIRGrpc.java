package ondewo.survey;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class FHIRGrpc {

  private FHIRGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.survey.FHIR";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.survey.Fhir.CreateFHIRSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getCreateFHIRSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFHIRSurvey",
      requestType = ondewo.survey.Fhir.CreateFHIRSurveyRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.Survey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.Fhir.CreateFHIRSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getCreateFHIRSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.Fhir.CreateFHIRSurveyRequest, ondewo.survey.SurveyOuterClass.Survey> getCreateFHIRSurveyMethod;
    if ((getCreateFHIRSurveyMethod = FHIRGrpc.getCreateFHIRSurveyMethod) == null) {
      synchronized (FHIRGrpc.class) {
        if ((getCreateFHIRSurveyMethod = FHIRGrpc.getCreateFHIRSurveyMethod) == null) {
          FHIRGrpc.getCreateFHIRSurveyMethod = getCreateFHIRSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.Fhir.CreateFHIRSurveyRequest, ondewo.survey.SurveyOuterClass.Survey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFHIRSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.Fhir.CreateFHIRSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.Survey.getDefaultInstance()))
              .setSchemaDescriptor(new FHIRMethodDescriptorSupplier("CreateFHIRSurvey"))
              .build();
        }
      }
    }
    return getCreateFHIRSurveyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest,
      ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getGetFHIRSurveyAnswersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFHIRSurveyAnswers",
      requestType = ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest.class,
      responseType = ondewo.survey.Fhir.SurveyFHIRAnswersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest,
      ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getGetFHIRSurveyAnswersMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest, ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getGetFHIRSurveyAnswersMethod;
    if ((getGetFHIRSurveyAnswersMethod = FHIRGrpc.getGetFHIRSurveyAnswersMethod) == null) {
      synchronized (FHIRGrpc.class) {
        if ((getGetFHIRSurveyAnswersMethod = FHIRGrpc.getGetFHIRSurveyAnswersMethod) == null) {
          FHIRGrpc.getGetFHIRSurveyAnswersMethod = getGetFHIRSurveyAnswersMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest, ondewo.survey.Fhir.SurveyFHIRAnswersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFHIRSurveyAnswers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.Fhir.SurveyFHIRAnswersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FHIRMethodDescriptorSupplier("GetFHIRSurveyAnswers"))
              .build();
        }
      }
    }
    return getGetFHIRSurveyAnswersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest,
      ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getGetAllFHIRSurveyAnswersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllFHIRSurveyAnswers",
      requestType = ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest.class,
      responseType = ondewo.survey.Fhir.SurveyFHIRAnswersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest,
      ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getGetAllFHIRSurveyAnswersMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest, ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getGetAllFHIRSurveyAnswersMethod;
    if ((getGetAllFHIRSurveyAnswersMethod = FHIRGrpc.getGetAllFHIRSurveyAnswersMethod) == null) {
      synchronized (FHIRGrpc.class) {
        if ((getGetAllFHIRSurveyAnswersMethod = FHIRGrpc.getGetAllFHIRSurveyAnswersMethod) == null) {
          FHIRGrpc.getGetAllFHIRSurveyAnswersMethod = getGetAllFHIRSurveyAnswersMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest, ondewo.survey.Fhir.SurveyFHIRAnswersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllFHIRSurveyAnswers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.Fhir.SurveyFHIRAnswersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FHIRMethodDescriptorSupplier("GetAllFHIRSurveyAnswers"))
              .build();
        }
      }
    }
    return getGetAllFHIRSurveyAnswersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FHIRStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FHIRStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FHIRStub>() {
        @java.lang.Override
        public FHIRStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FHIRStub(channel, callOptions);
        }
      };
    return FHIRStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static FHIRBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FHIRBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FHIRBlockingV2Stub>() {
        @java.lang.Override
        public FHIRBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FHIRBlockingV2Stub(channel, callOptions);
        }
      };
    return FHIRBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FHIRBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FHIRBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FHIRBlockingStub>() {
        @java.lang.Override
        public FHIRBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FHIRBlockingStub(channel, callOptions);
        }
      };
    return FHIRBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FHIRFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FHIRFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FHIRFutureStub>() {
        @java.lang.Override
        public FHIRFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FHIRFutureStub(channel, callOptions);
        }
      };
    return FHIRFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a Survey from FHIR format and an empty NLU Agent for it
     * </pre>
     */
    default void createFHIRSurvey(ondewo.survey.Fhir.CreateFHIRSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFHIRSurveyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Survey Answers on FHIR format
     * </pre>
     */
    default void getFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.Fhir.SurveyFHIRAnswersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFHIRSurveyAnswersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all Survey Answers on FHIR format
     * </pre>
     */
    default void getAllFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.Fhir.SurveyFHIRAnswersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFHIRSurveyAnswersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FHIR.
   */
  public static abstract class FHIRImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FHIRGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FHIR.
   */
  public static final class FHIRStub
      extends io.grpc.stub.AbstractAsyncStub<FHIRStub> {
    private FHIRStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FHIRStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FHIRStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Survey from FHIR format and an empty NLU Agent for it
     * </pre>
     */
    public void createFHIRSurvey(ondewo.survey.Fhir.CreateFHIRSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFHIRSurveyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Survey Answers on FHIR format
     * </pre>
     */
    public void getFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.Fhir.SurveyFHIRAnswersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFHIRSurveyAnswersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all Survey Answers on FHIR format
     * </pre>
     */
    public void getAllFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.Fhir.SurveyFHIRAnswersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllFHIRSurveyAnswersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FHIR.
   */
  public static final class FHIRBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<FHIRBlockingV2Stub> {
    private FHIRBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FHIRBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FHIRBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Survey from FHIR format and an empty NLU Agent for it
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey createFHIRSurvey(ondewo.survey.Fhir.CreateFHIRSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateFHIRSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Survey Answers on FHIR format
     * </pre>
     */
    public ondewo.survey.Fhir.SurveyFHIRAnswersResponse getFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFHIRSurveyAnswersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all Survey Answers on FHIR format
     * </pre>
     */
    public ondewo.survey.Fhir.SurveyFHIRAnswersResponse getAllFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAllFHIRSurveyAnswersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service FHIR.
   */
  public static final class FHIRBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FHIRBlockingStub> {
    private FHIRBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FHIRBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FHIRBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Survey from FHIR format and an empty NLU Agent for it
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey createFHIRSurvey(ondewo.survey.Fhir.CreateFHIRSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFHIRSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Survey Answers on FHIR format
     * </pre>
     */
    public ondewo.survey.Fhir.SurveyFHIRAnswersResponse getFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFHIRSurveyAnswersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all Survey Answers on FHIR format
     * </pre>
     */
    public ondewo.survey.Fhir.SurveyFHIRAnswersResponse getAllFHIRSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllFHIRSurveyAnswersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FHIR.
   */
  public static final class FHIRFutureStub
      extends io.grpc.stub.AbstractFutureStub<FHIRFutureStub> {
    private FHIRFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FHIRFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FHIRFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Survey from FHIR format and an empty NLU Agent for it
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.Survey> createFHIRSurvey(
        ondewo.survey.Fhir.CreateFHIRSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFHIRSurveyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Survey Answers on FHIR format
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getFHIRSurveyAnswers(
        ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFHIRSurveyAnswersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all Survey Answers on FHIR format
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.Fhir.SurveyFHIRAnswersResponse> getAllFHIRSurveyAnswers(
        ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllFHIRSurveyAnswersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FHIRSURVEY = 0;
  private static final int METHODID_GET_FHIRSURVEY_ANSWERS = 1;
  private static final int METHODID_GET_ALL_FHIRSURVEY_ANSWERS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FHIRSURVEY:
          serviceImpl.createFHIRSurvey((ondewo.survey.Fhir.CreateFHIRSurveyRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey>) responseObserver);
          break;
        case METHODID_GET_FHIRSURVEY_ANSWERS:
          serviceImpl.getFHIRSurveyAnswers((ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.Fhir.SurveyFHIRAnswersResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FHIRSURVEY_ANSWERS:
          serviceImpl.getAllFHIRSurveyAnswers((ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.Fhir.SurveyFHIRAnswersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateFHIRSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.Fhir.CreateFHIRSurveyRequest,
              ondewo.survey.SurveyOuterClass.Survey>(
                service, METHODID_CREATE_FHIRSURVEY)))
        .addMethod(
          getGetFHIRSurveyAnswersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest,
              ondewo.survey.Fhir.SurveyFHIRAnswersResponse>(
                service, METHODID_GET_FHIRSURVEY_ANSWERS)))
        .addMethod(
          getGetAllFHIRSurveyAnswersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest,
              ondewo.survey.Fhir.SurveyFHIRAnswersResponse>(
                service, METHODID_GET_ALL_FHIRSURVEY_ANSWERS)))
        .build();
  }

  private static abstract class FHIRBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FHIRBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.survey.Fhir.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FHIR");
    }
  }

  private static final class FHIRFileDescriptorSupplier
      extends FHIRBaseDescriptorSupplier {
    FHIRFileDescriptorSupplier() {}
  }

  private static final class FHIRMethodDescriptorSupplier
      extends FHIRBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FHIRMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FHIRGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FHIRFileDescriptorSupplier())
              .addMethod(getCreateFHIRSurveyMethod())
              .addMethod(getGetFHIRSurveyAnswersMethod())
              .addMethod(getGetAllFHIRSurveyAnswersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
