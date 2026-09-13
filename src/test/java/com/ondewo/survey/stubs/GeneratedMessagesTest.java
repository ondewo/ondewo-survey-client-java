package com.ondewo.survey.stubs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import java.util.stream.Stream;
import ondewo.survey.Fhir;
import ondewo.survey.SurveyOuterClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Exercises the committed protoc output. These are the tests that catch a broken generator:
 * they build a message, push it through the real binary marshaller and read it back.
 *
 * <p>Unlike the nlu-derived clients, ondewo-survey-api sets {@code java_multiple_files} on
 * neither of its two protos, so there is no {@code com/} source tree at all: every message of
 * this product is nested in an outer class in {@code ondewo.survey} - {@code SurveyOuterClass}
 * for survey.proto (protoc appends the suffix because the file declares a message named
 * {@code Survey}) and {@code Fhir} for fhir.proto. There is also no {@code optional} scalar
 * anywhere in these protos, so the explicit-presence case the other products assert has no
 * subject here and is deliberately absent rather than faked.
 */
class GeneratedMessagesTest {

    @Test
    void roundTripsAnOuterClassMessage() throws Exception {
        final SurveyOuterClass.Survey original =
                SurveyOuterClass.Survey.newBuilder()
                        .setSurveyId("projects/6a1b2c3d-0000-4000-8000-000000000000/agent")
                        .setDisplayName("customer-satisfaction")
                        .setLanguageCode("de")
                        .addQuestions(
                                SurveyOuterClass.Question.newBuilder()
                                        .setOpenQuestion(
                                                SurveyOuterClass.OpenQuestion.newBuilder()
                                                        .setQuestionText("Wie geht es Ihnen?")
                                                        .build())
                                        .build())
                        .setSurveyInfo(
                                SurveyOuterClass.SurveyInfo.newBuilder()
                                        .setLegalEntity("ONDEWO GmbH")
                                        .setTopic("Zufriedenheit")
                                        .setAnonymous(true)
                                        .build())
                        .addExcludeSubflows(SurveyOuterClass.SubFlow.PHONE_HOURS)
                        .setStatus(SurveyOuterClass.Survey.AgentStatus.UPDATED)
                        .build();

        final byte[] wire = original.toByteArray();
        final SurveyOuterClass.Survey parsed = SurveyOuterClass.Survey.parseFrom(wire);

        assertEquals(original, parsed);
        assertEquals("customer-satisfaction", parsed.getDisplayName());
        assertEquals(1, parsed.getQuestionsCount());
        assertEquals("Wie geht es Ihnen?", parsed.getQuestions(0).getOpenQuestion().getQuestionText());
        assertEquals("ONDEWO GmbH", parsed.getSurveyInfo().getLegalEntity());
        assertTrue(parsed.getSurveyInfo().getAnonymous());
        assertEquals(SurveyOuterClass.SubFlow.PHONE_HOURS, parsed.getExcludeSubflows(0));
        assertEquals(SurveyOuterClass.Survey.AgentStatus.UPDATED, parsed.getStatus());
        assertTrue(wire.length > 0);
    }

    /**
     * The {@code oneof identifier} of GetSurveyAnswersRequest: setting a second member has to
     * clear the first, and the case enum has to come back from the wire.
     */
    @Test
    void roundTripsAOneof() throws Exception {
        final SurveyOuterClass.GetSurveyAnswersRequest request =
                SurveyOuterClass.GetSurveyAnswersRequest.newBuilder()
                        .setSurveyId("projects/6a1b2c3d-0000-4000-8000-000000000000/agent")
                        .setSessionId("session-1")
                        .setUserPhoneNumber("+431234567")
                        .build();

        final SurveyOuterClass.GetSurveyAnswersRequest parsed =
                SurveyOuterClass.GetSurveyAnswersRequest.parseFrom(request.toByteArray());

        assertEquals(request, parsed);
        assertEquals("", parsed.getSessionId());
        assertEquals("+431234567", parsed.getUserPhoneNumber());
        assertEquals(
                SurveyOuterClass.GetSurveyAnswersRequest.IdentifierCase.USER_PHONE_NUMBER,
                parsed.getIdentifierCase());
    }

    /** fhir.proto carries google.protobuf.Struct fields, consumed from protobuf-java. */
    @Test
    void roundTripsAWellKnownTypeField() throws Exception {
        final Fhir.CreateFHIRSurveyRequest original =
                Fhir.CreateFHIRSurveyRequest.newBuilder()
                        .setFhirQuestionnaire(
                                Struct.newBuilder()
                                        .putFields(
                                                "resourceType",
                                                Value.newBuilder()
                                                        .setStringValue("Questionnaire")
                                                        .build())
                                        .build())
                        .build();

        final Fhir.CreateFHIRSurveyRequest parsed =
                Fhir.CreateFHIRSurveyRequest.parseFrom(original.toByteArray());

        assertEquals(original, parsed);
        assertEquals(
                "Questionnaire",
                parsed.getFhirQuestionnaire().getFieldsOrThrow("resourceType").getStringValue());
    }

    @Test
    void keepsTheProtoPackageInTheDescriptor() {
        // The java_package of these protos is rewritten by the compiler image, but the PROTO
        // package - what goes on the wire - must stay ondewo.survey for both files.
        assertEquals("ondewo.survey.Survey", SurveyOuterClass.Survey.getDescriptor().getFullName());
        assertEquals(
                "ondewo.survey.SurveyInfo",
                SurveyOuterClass.SurveyInfo.getDescriptor().getFullName());
        assertEquals(
                "ondewo.survey.CreateFHIRSurveyRequest",
                Fhir.CreateFHIRSurveyRequest.getDescriptor().getFullName());
    }

    @ParameterizedTest(name = "{0} has the zero value {1}")
    @MethodSource("zeroValues")
    void everyEnumDeclaresItsDefaultAtZero(final String name, final int number, final Object zeroValue) {
        assertEquals(0, number, name);
        assertEquals(name, zeroValue.toString());
    }

    /**
     * {@code SubFlow} spells its default {@code SUBFLOW_UNSPECIFIED}; the nested
     * {@code Survey.AgentStatus} predates that convention and names its zero member
     * {@code TO_BE_INITIALIZED}. Either way the member carrying number 0 is what a proto3 field
     * falls back to, so that is what is pinned.
     */
    private static Stream<Arguments> zeroValues() {
        return Stream.of(
                Arguments.of(
                        "SUBFLOW_UNSPECIFIED",
                        SurveyOuterClass.SubFlow.SUBFLOW_UNSPECIFIED.getNumber(),
                        SurveyOuterClass.SubFlow.forNumber(0)),
                Arguments.of(
                        "TO_BE_INITIALIZED",
                        SurveyOuterClass.Survey.AgentStatus.TO_BE_INITIALIZED.getNumber(),
                        SurveyOuterClass.Survey.AgentStatus.forNumber(0)));
    }

    @Test
    void defaultInstancesAreEmpty() {
        assertEquals("", SurveyOuterClass.Survey.getDefaultInstance().getSurveyId());
        assertEquals(0, SurveyOuterClass.Survey.getDefaultInstance().getQuestionsCount());
        assertEquals(
                SurveyOuterClass.Survey.AgentStatus.TO_BE_INITIALIZED,
                SurveyOuterClass.Survey.getDefaultInstance().getStatus());
        assertEquals(0, SurveyOuterClass.Survey.getDefaultInstance().getSerializedSize());
    }
}
