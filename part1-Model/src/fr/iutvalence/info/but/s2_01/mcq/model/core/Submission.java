package src.fr.iutvalence.info.but.s2_01.mcq.model.core;

import java.util.Arrays;

/**
 * Submission (of a questionnaire).
 */
public class Submission  {
    /**
     * Attribus
     */
    private final QuestionnaireId questionnaireID;
    private final String fillerName;
    private final int[] answerIds;

    /**
     * Constructeur
     */
    public Submission(QuestionnaireId questionnaireID, String fillerName, int[] answerIds) {
        this.questionnaireID = questionnaireID;
        this.fillerName = fillerName;
        this.answerIds = answerIds;
    }

    /**
     * Methodes
     */

    /**
     * Getter
     */
    public String getFillerName() {
        return this.fillerName;
    }

    public QuestionnaireId getQuestionnaireID() {
        return this.questionnaireID;
    }

    public int getAnswerIds(int theAnswerIds) {
        return this.answerIds[theAnswerIds];
    }

    public int getAnswerCount(){
        return this.answerIds.length;
    }

    public String toString() {
        String result ="Filler: "+this.fillerName;
        result+="\nQuestionnaire: "+this.questionnaireID;
        for (int i=0;i<this.getAnswerCount();i++){
            result+="\nQuestion "+i+": "+this.answerIds[i];
        }
        return result;
    }

    public SubmissionId getId(){
        return new SubmissionId(this.fillerName,this.questionnaireID);
    }
}