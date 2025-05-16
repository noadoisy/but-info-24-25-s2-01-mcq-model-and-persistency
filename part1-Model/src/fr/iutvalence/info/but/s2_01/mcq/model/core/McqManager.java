package src.fr.iutvalence.info.but.s2_01.mcq.model.core;

import java.util.Map;

/**
 * Mcq manager, allowing to handle questionnaires and submissions.
 */
public class McqManager {
    /**
     * Attribute
     */
    private Map<QuestionnaireId,Questionnaire> questionnaire;
    private Map<SubmissionId,Submission> submission;

    /**
     * Constructor
     */
    public McqManager() {
    }

    /**
     * Methodes
     */

    public boolean addQuestionnaire(Questionnaire questionnaire){
        if (this.questionnaire.containsKey(questionnaire.getId())){
            this.questionnaire.put(questionnaire.getId(),questionnaire);
            return true;
        }
        return false;
    }

    public boolean addSubmission(Submission submission){
        if (this.submission.containsKey(submission.getId())){
            this.submission.put(submission.getId(),submission);
            return true;
        }
        return false;
    }

    public Questionnaire getQuestionnaire(QuestionnaireId questionnaireId){
        return this.questionnaire.get(questionnaireId);
    }

    public int getQuestionnaireCount(){
        return this.questionnaire.size();
    }

    public Submission getSubmission(SubmissionId submissionId){
        return this.submission.get(submissionId);
    }

    public int getSubmissionCount(){
        return this.submission.size();
    }

    public boolean removeQuestionnaire(QuestionnaireId questionnaireId){
        if (this.questionnaire.containsKey(questionnaireId)){
            this.questionnaire.remove(questionnaireId);
            return true;
        }
        return false;
    }

    public boolean removeSubmission(SubmissionId submissionId){
        if (this.submission.containsKey(submissionId)){
            this.submission.remove(submissionId);
            return true;
        }
        return false;
    }




}
