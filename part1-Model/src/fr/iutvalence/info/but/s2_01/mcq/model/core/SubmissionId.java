package src.fr.iutvalence.info.but.s2_01.mcq.model.core;

import java.util.Objects;

/**
 * Submission unique id, made of filler name and questionnaire id.
 */
public class SubmissionId  {

    /**
     * Attribute
     */
    private final static String SEPARATOR="-";
    private final String fillerName;
    private final QuestionnaireId questionnaireId;

    /**
     * Constructor
     */
    public SubmissionId(String fillerName, QuestionnaireId questionnaireId) {
        this.fillerName = fillerName;
        this.questionnaireId = questionnaireId;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SubmissionId that = (SubmissionId) o;
        return Objects.equals(fillerName, that.fillerName) && Objects.equals(questionnaireId, that.questionnaireId);
    }

    public int hashCode() {
        return Objects.hash(fillerName, questionnaireId);
    }

    public String toString() {
        return this.fillerName+SEPARATOR+questionnaireId;
    }

}