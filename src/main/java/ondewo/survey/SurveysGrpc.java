package ondewo.survey;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SurveysGrpc {

  private SurveysGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.survey.Surveys";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.CreateSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getCreateSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSurvey",
      requestType = ondewo.survey.SurveyOuterClass.CreateSurveyRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.Survey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.CreateSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getCreateSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.CreateSurveyRequest, ondewo.survey.SurveyOuterClass.Survey> getCreateSurveyMethod;
    if ((getCreateSurveyMethod = SurveysGrpc.getCreateSurveyMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getCreateSurveyMethod = SurveysGrpc.getCreateSurveyMethod) == null) {
          SurveysGrpc.getCreateSurveyMethod = getCreateSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.CreateSurveyRequest, ondewo.survey.SurveyOuterClass.Survey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.CreateSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.Survey.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("CreateSurvey"))
              .build();
        }
      }
    }
    return getCreateSurveyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getGetSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurvey",
      requestType = ondewo.survey.SurveyOuterClass.GetSurveyRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.Survey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getGetSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyRequest, ondewo.survey.SurveyOuterClass.Survey> getGetSurveyMethod;
    if ((getGetSurveyMethod = SurveysGrpc.getGetSurveyMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getGetSurveyMethod = SurveysGrpc.getGetSurveyMethod) == null) {
          SurveysGrpc.getGetSurveyMethod = getGetSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.GetSurveyRequest, ondewo.survey.SurveyOuterClass.Survey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.GetSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.Survey.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("GetSurvey"))
              .build();
        }
      }
    }
    return getGetSurveyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.UpdateSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getUpdateSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSurvey",
      requestType = ondewo.survey.SurveyOuterClass.UpdateSurveyRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.Survey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.UpdateSurveyRequest,
      ondewo.survey.SurveyOuterClass.Survey> getUpdateSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.UpdateSurveyRequest, ondewo.survey.SurveyOuterClass.Survey> getUpdateSurveyMethod;
    if ((getUpdateSurveyMethod = SurveysGrpc.getUpdateSurveyMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getUpdateSurveyMethod = SurveysGrpc.getUpdateSurveyMethod) == null) {
          SurveysGrpc.getUpdateSurveyMethod = getUpdateSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.UpdateSurveyRequest, ondewo.survey.SurveyOuterClass.Survey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.UpdateSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.Survey.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("UpdateSurvey"))
              .build();
        }
      }
    }
    return getUpdateSurveyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.DeleteSurveyRequest,
      com.google.protobuf.Empty> getDeleteSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSurvey",
      requestType = ondewo.survey.SurveyOuterClass.DeleteSurveyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.DeleteSurveyRequest,
      com.google.protobuf.Empty> getDeleteSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.DeleteSurveyRequest, com.google.protobuf.Empty> getDeleteSurveyMethod;
    if ((getDeleteSurveyMethod = SurveysGrpc.getDeleteSurveyMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getDeleteSurveyMethod = SurveysGrpc.getDeleteSurveyMethod) == null) {
          SurveysGrpc.getDeleteSurveyMethod = getDeleteSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.DeleteSurveyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.DeleteSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("DeleteSurvey"))
              .build();
        }
      }
    }
    return getDeleteSurveyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.ListSurveysRequest,
      ondewo.survey.SurveyOuterClass.ListSurveysResponse> getListSurveysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSurveys",
      requestType = ondewo.survey.SurveyOuterClass.ListSurveysRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.ListSurveysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.ListSurveysRequest,
      ondewo.survey.SurveyOuterClass.ListSurveysResponse> getListSurveysMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.ListSurveysRequest, ondewo.survey.SurveyOuterClass.ListSurveysResponse> getListSurveysMethod;
    if ((getListSurveysMethod = SurveysGrpc.getListSurveysMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getListSurveysMethod = SurveysGrpc.getListSurveysMethod) == null) {
          SurveysGrpc.getListSurveysMethod = getListSurveysMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.ListSurveysRequest, ondewo.survey.SurveyOuterClass.ListSurveysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSurveys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.ListSurveysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.ListSurveysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("ListSurveys"))
              .build();
        }
      }
    }
    return getListSurveysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest,
      ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getGetSurveyAnswersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurveyAnswers",
      requestType = ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.SurveyAnswersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest,
      ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getGetSurveyAnswersMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest, ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getGetSurveyAnswersMethod;
    if ((getGetSurveyAnswersMethod = SurveysGrpc.getGetSurveyAnswersMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getGetSurveyAnswersMethod = SurveysGrpc.getGetSurveyAnswersMethod) == null) {
          SurveysGrpc.getGetSurveyAnswersMethod = getGetSurveyAnswersMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest, ondewo.survey.SurveyOuterClass.SurveyAnswersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSurveyAnswers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.SurveyAnswersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("GetSurveyAnswers"))
              .build();
        }
      }
    }
    return getGetSurveyAnswersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest,
      ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getGetAllSurveyAnswersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllSurveyAnswers",
      requestType = ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.SurveyAnswersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest,
      ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getGetAllSurveyAnswersMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest, ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getGetAllSurveyAnswersMethod;
    if ((getGetAllSurveyAnswersMethod = SurveysGrpc.getGetAllSurveyAnswersMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getGetAllSurveyAnswersMethod = SurveysGrpc.getGetAllSurveyAnswersMethod) == null) {
          SurveysGrpc.getGetAllSurveyAnswersMethod = getGetAllSurveyAnswersMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest, ondewo.survey.SurveyOuterClass.SurveyAnswersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllSurveyAnswers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.SurveyAnswersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("GetAllSurveyAnswers"))
              .build();
        }
      }
    }
    return getGetAllSurveyAnswersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
      ondewo.survey.SurveyOuterClass.AgentSurveyResponse> getCreateAgentSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentSurvey",
      requestType = ondewo.survey.SurveyOuterClass.AgentSurveyRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.AgentSurveyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
      ondewo.survey.SurveyOuterClass.AgentSurveyResponse> getCreateAgentSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest, ondewo.survey.SurveyOuterClass.AgentSurveyResponse> getCreateAgentSurveyMethod;
    if ((getCreateAgentSurveyMethod = SurveysGrpc.getCreateAgentSurveyMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getCreateAgentSurveyMethod = SurveysGrpc.getCreateAgentSurveyMethod) == null) {
          SurveysGrpc.getCreateAgentSurveyMethod = getCreateAgentSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.AgentSurveyRequest, ondewo.survey.SurveyOuterClass.AgentSurveyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.AgentSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.AgentSurveyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("CreateAgentSurvey"))
              .build();
        }
      }
    }
    return getCreateAgentSurveyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
      ondewo.survey.SurveyOuterClass.AgentSurveyResponse> getUpdateAgentSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentSurvey",
      requestType = ondewo.survey.SurveyOuterClass.AgentSurveyRequest.class,
      responseType = ondewo.survey.SurveyOuterClass.AgentSurveyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
      ondewo.survey.SurveyOuterClass.AgentSurveyResponse> getUpdateAgentSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest, ondewo.survey.SurveyOuterClass.AgentSurveyResponse> getUpdateAgentSurveyMethod;
    if ((getUpdateAgentSurveyMethod = SurveysGrpc.getUpdateAgentSurveyMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getUpdateAgentSurveyMethod = SurveysGrpc.getUpdateAgentSurveyMethod) == null) {
          SurveysGrpc.getUpdateAgentSurveyMethod = getUpdateAgentSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.AgentSurveyRequest, ondewo.survey.SurveyOuterClass.AgentSurveyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.AgentSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.AgentSurveyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("UpdateAgentSurvey"))
              .build();
        }
      }
    }
    return getUpdateAgentSurveyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
      com.google.protobuf.Empty> getDeleteAgentSurveyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentSurvey",
      requestType = ondewo.survey.SurveyOuterClass.AgentSurveyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
      com.google.protobuf.Empty> getDeleteAgentSurveyMethod() {
    io.grpc.MethodDescriptor<ondewo.survey.SurveyOuterClass.AgentSurveyRequest, com.google.protobuf.Empty> getDeleteAgentSurveyMethod;
    if ((getDeleteAgentSurveyMethod = SurveysGrpc.getDeleteAgentSurveyMethod) == null) {
      synchronized (SurveysGrpc.class) {
        if ((getDeleteAgentSurveyMethod = SurveysGrpc.getDeleteAgentSurveyMethod) == null) {
          SurveysGrpc.getDeleteAgentSurveyMethod = getDeleteAgentSurveyMethod =
              io.grpc.MethodDescriptor.<ondewo.survey.SurveyOuterClass.AgentSurveyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentSurvey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.survey.SurveyOuterClass.AgentSurveyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SurveysMethodDescriptorSupplier("DeleteAgentSurvey"))
              .build();
        }
      }
    }
    return getDeleteAgentSurveyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SurveysStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SurveysStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SurveysStub>() {
        @java.lang.Override
        public SurveysStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SurveysStub(channel, callOptions);
        }
      };
    return SurveysStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SurveysBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SurveysBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SurveysBlockingV2Stub>() {
        @java.lang.Override
        public SurveysBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SurveysBlockingV2Stub(channel, callOptions);
        }
      };
    return SurveysBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SurveysBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SurveysBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SurveysBlockingStub>() {
        @java.lang.Override
        public SurveysBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SurveysBlockingStub(channel, callOptions);
        }
      };
    return SurveysBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SurveysFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SurveysFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SurveysFutureStub>() {
        @java.lang.Override
        public SurveysFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SurveysFutureStub(channel, callOptions);
        }
      };
    return SurveysFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * &lt;p&gt;Create a Survey and an empty NLU Agent for it&lt;/p&gt;
     * </pre>
     */
    default void createSurvey(ondewo.survey.SurveyOuterClass.CreateSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSurveyMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve a Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    default void getSurvey(ondewo.survey.SurveyOuterClass.GetSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSurveyMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an existing Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    default void updateSurvey(ondewo.survey.SurveyOuterClass.UpdateSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSurveyMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a survey and its associated agent (if existent)&lt;/p&gt;
     * </pre>
     */
    default void deleteSurvey(ondewo.survey.SurveyOuterClass.DeleteSurveyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSurveyMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns the list of all surveys in the server&lt;/p&gt;
     * </pre>
     */
    default void listSurveys(ondewo.survey.SurveyOuterClass.ListSurveysRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.ListSurveysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSurveysMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve answers to survey questions collected in interactions with a survey agent for a specific session&lt;/p&gt;
     * </pre>
     */
    default void getSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSurveyAnswersMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve all answers to survey questions collected in interactions with a survey agent in any session&lt;/p&gt;
     * </pre>
     */
    default void getAllSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSurveyAnswersMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Populate and configures an NLU Agent from a Survey&lt;/p&gt;
     * </pre>
     */
    default void createAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.AgentSurveyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentSurveyMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an NLU agent from a survey&lt;/p&gt;
     * </pre>
     */
    default void updateAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.AgentSurveyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentSurveyMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes all data of an NLU agent associated to a survey&lt;/p&gt;
     * </pre>
     */
    default void deleteAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentSurveyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Surveys.
   */
  public static abstract class SurveysImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SurveysGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Surveys.
   */
  public static final class SurveysStub
      extends io.grpc.stub.AbstractAsyncStub<SurveysStub> {
    private SurveysStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurveysStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SurveysStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a Survey and an empty NLU Agent for it&lt;/p&gt;
     * </pre>
     */
    public void createSurvey(ondewo.survey.SurveyOuterClass.CreateSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSurveyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve a Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public void getSurvey(ondewo.survey.SurveyOuterClass.GetSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSurveyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an existing Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public void updateSurvey(ondewo.survey.SurveyOuterClass.UpdateSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSurveyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a survey and its associated agent (if existent)&lt;/p&gt;
     * </pre>
     */
    public void deleteSurvey(ondewo.survey.SurveyOuterClass.DeleteSurveyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSurveyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns the list of all surveys in the server&lt;/p&gt;
     * </pre>
     */
    public void listSurveys(ondewo.survey.SurveyOuterClass.ListSurveysRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.ListSurveysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSurveysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve answers to survey questions collected in interactions with a survey agent for a specific session&lt;/p&gt;
     * </pre>
     */
    public void getSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSurveyAnswersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve all answers to survey questions collected in interactions with a survey agent in any session&lt;/p&gt;
     * </pre>
     */
    public void getAllSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllSurveyAnswersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Populate and configures an NLU Agent from a Survey&lt;/p&gt;
     * </pre>
     */
    public void createAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.AgentSurveyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentSurveyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an NLU agent from a survey&lt;/p&gt;
     * </pre>
     */
    public void updateAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request,
        io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.AgentSurveyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentSurveyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes all data of an NLU agent associated to a survey&lt;/p&gt;
     * </pre>
     */
    public void deleteAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentSurveyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Surveys.
   */
  public static final class SurveysBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SurveysBlockingV2Stub> {
    private SurveysBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurveysBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SurveysBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a Survey and an empty NLU Agent for it&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey createSurvey(ondewo.survey.SurveyOuterClass.CreateSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve a Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey getSurvey(ondewo.survey.SurveyOuterClass.GetSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an existing Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey updateSurvey(ondewo.survey.SurveyOuterClass.UpdateSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a survey and its associated agent (if existent)&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteSurvey(ondewo.survey.SurveyOuterClass.DeleteSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns the list of all surveys in the server&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.ListSurveysResponse listSurveys(ondewo.survey.SurveyOuterClass.ListSurveysRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSurveysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve answers to survey questions collected in interactions with a survey agent for a specific session&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.SurveyAnswersResponse getSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSurveyAnswersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve all answers to survey questions collected in interactions with a survey agent in any session&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.SurveyAnswersResponse getAllSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAllSurveyAnswersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Populate and configures an NLU Agent from a Survey&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.AgentSurveyResponse createAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateAgentSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an NLU agent from a survey&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.AgentSurveyResponse updateAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateAgentSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes all data of an NLU agent associated to a survey&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteAgentSurveyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Surveys.
   */
  public static final class SurveysBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SurveysBlockingStub> {
    private SurveysBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurveysBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SurveysBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a Survey and an empty NLU Agent for it&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey createSurvey(ondewo.survey.SurveyOuterClass.CreateSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve a Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey getSurvey(ondewo.survey.SurveyOuterClass.GetSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an existing Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.Survey updateSurvey(ondewo.survey.SurveyOuterClass.UpdateSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a survey and its associated agent (if existent)&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteSurvey(ondewo.survey.SurveyOuterClass.DeleteSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns the list of all surveys in the server&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.ListSurveysResponse listSurveys(ondewo.survey.SurveyOuterClass.ListSurveysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSurveysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve answers to survey questions collected in interactions with a survey agent for a specific session&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.SurveyAnswersResponse getSurveyAnswers(ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSurveyAnswersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve all answers to survey questions collected in interactions with a survey agent in any session&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.SurveyAnswersResponse getAllSurveyAnswers(ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllSurveyAnswersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Populate and configures an NLU Agent from a Survey&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.AgentSurveyResponse createAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an NLU agent from a survey&lt;/p&gt;
     * </pre>
     */
    public ondewo.survey.SurveyOuterClass.AgentSurveyResponse updateAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentSurveyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes all data of an NLU agent associated to a survey&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteAgentSurvey(ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentSurveyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Surveys.
   */
  public static final class SurveysFutureStub
      extends io.grpc.stub.AbstractFutureStub<SurveysFutureStub> {
    private SurveysFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurveysFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SurveysFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a Survey and an empty NLU Agent for it&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.Survey> createSurvey(
        ondewo.survey.SurveyOuterClass.CreateSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSurveyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve a Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.Survey> getSurvey(
        ondewo.survey.SurveyOuterClass.GetSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSurveyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an existing Survey message from the Database and return it&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.Survey> updateSurvey(
        ondewo.survey.SurveyOuterClass.UpdateSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSurveyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a survey and its associated agent (if existent)&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSurvey(
        ondewo.survey.SurveyOuterClass.DeleteSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSurveyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns the list of all surveys in the server&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.ListSurveysResponse> listSurveys(
        ondewo.survey.SurveyOuterClass.ListSurveysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSurveysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve answers to survey questions collected in interactions with a survey agent for a specific session&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getSurveyAnswers(
        ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSurveyAnswersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieve all answers to survey questions collected in interactions with a survey agent in any session&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse> getAllSurveyAnswers(
        ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllSurveyAnswersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Populate and configures an NLU Agent from a Survey&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.AgentSurveyResponse> createAgentSurvey(
        ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentSurveyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Update an NLU agent from a survey&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.survey.SurveyOuterClass.AgentSurveyResponse> updateAgentSurvey(
        ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentSurveyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes all data of an NLU agent associated to a survey&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAgentSurvey(
        ondewo.survey.SurveyOuterClass.AgentSurveyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentSurveyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SURVEY = 0;
  private static final int METHODID_GET_SURVEY = 1;
  private static final int METHODID_UPDATE_SURVEY = 2;
  private static final int METHODID_DELETE_SURVEY = 3;
  private static final int METHODID_LIST_SURVEYS = 4;
  private static final int METHODID_GET_SURVEY_ANSWERS = 5;
  private static final int METHODID_GET_ALL_SURVEY_ANSWERS = 6;
  private static final int METHODID_CREATE_AGENT_SURVEY = 7;
  private static final int METHODID_UPDATE_AGENT_SURVEY = 8;
  private static final int METHODID_DELETE_AGENT_SURVEY = 9;

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
        case METHODID_CREATE_SURVEY:
          serviceImpl.createSurvey((ondewo.survey.SurveyOuterClass.CreateSurveyRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey>) responseObserver);
          break;
        case METHODID_GET_SURVEY:
          serviceImpl.getSurvey((ondewo.survey.SurveyOuterClass.GetSurveyRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey>) responseObserver);
          break;
        case METHODID_UPDATE_SURVEY:
          serviceImpl.updateSurvey((ondewo.survey.SurveyOuterClass.UpdateSurveyRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.Survey>) responseObserver);
          break;
        case METHODID_DELETE_SURVEY:
          serviceImpl.deleteSurvey((ondewo.survey.SurveyOuterClass.DeleteSurveyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SURVEYS:
          serviceImpl.listSurveys((ondewo.survey.SurveyOuterClass.ListSurveysRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.ListSurveysResponse>) responseObserver);
          break;
        case METHODID_GET_SURVEY_ANSWERS:
          serviceImpl.getSurveyAnswers((ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_SURVEY_ANSWERS:
          serviceImpl.getAllSurveyAnswers((ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.SurveyAnswersResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_SURVEY:
          serviceImpl.createAgentSurvey((ondewo.survey.SurveyOuterClass.AgentSurveyRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.AgentSurveyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_SURVEY:
          serviceImpl.updateAgentSurvey((ondewo.survey.SurveyOuterClass.AgentSurveyRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.survey.SurveyOuterClass.AgentSurveyResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_SURVEY:
          serviceImpl.deleteAgentSurvey((ondewo.survey.SurveyOuterClass.AgentSurveyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getCreateSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.CreateSurveyRequest,
              ondewo.survey.SurveyOuterClass.Survey>(
                service, METHODID_CREATE_SURVEY)))
        .addMethod(
          getGetSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.GetSurveyRequest,
              ondewo.survey.SurveyOuterClass.Survey>(
                service, METHODID_GET_SURVEY)))
        .addMethod(
          getUpdateSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.UpdateSurveyRequest,
              ondewo.survey.SurveyOuterClass.Survey>(
                service, METHODID_UPDATE_SURVEY)))
        .addMethod(
          getDeleteSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.DeleteSurveyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SURVEY)))
        .addMethod(
          getListSurveysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.ListSurveysRequest,
              ondewo.survey.SurveyOuterClass.ListSurveysResponse>(
                service, METHODID_LIST_SURVEYS)))
        .addMethod(
          getGetSurveyAnswersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.GetSurveyAnswersRequest,
              ondewo.survey.SurveyOuterClass.SurveyAnswersResponse>(
                service, METHODID_GET_SURVEY_ANSWERS)))
        .addMethod(
          getGetAllSurveyAnswersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.GetAllSurveyAnswersRequest,
              ondewo.survey.SurveyOuterClass.SurveyAnswersResponse>(
                service, METHODID_GET_ALL_SURVEY_ANSWERS)))
        .addMethod(
          getCreateAgentSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
              ondewo.survey.SurveyOuterClass.AgentSurveyResponse>(
                service, METHODID_CREATE_AGENT_SURVEY)))
        .addMethod(
          getUpdateAgentSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
              ondewo.survey.SurveyOuterClass.AgentSurveyResponse>(
                service, METHODID_UPDATE_AGENT_SURVEY)))
        .addMethod(
          getDeleteAgentSurveyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.survey.SurveyOuterClass.AgentSurveyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_AGENT_SURVEY)))
        .build();
  }

  private static abstract class SurveysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SurveysBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.survey.SurveyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Surveys");
    }
  }

  private static final class SurveysFileDescriptorSupplier
      extends SurveysBaseDescriptorSupplier {
    SurveysFileDescriptorSupplier() {}
  }

  private static final class SurveysMethodDescriptorSupplier
      extends SurveysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SurveysMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SurveysGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SurveysFileDescriptorSupplier())
              .addMethod(getCreateSurveyMethod())
              .addMethod(getGetSurveyMethod())
              .addMethod(getUpdateSurveyMethod())
              .addMethod(getDeleteSurveyMethod())
              .addMethod(getListSurveysMethod())
              .addMethod(getGetSurveyAnswersMethod())
              .addMethod(getGetAllSurveyAnswersMethod())
              .addMethod(getCreateAgentSurveyMethod())
              .addMethod(getUpdateAgentSurveyMethod())
              .addMethod(getDeleteAgentSurveyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
