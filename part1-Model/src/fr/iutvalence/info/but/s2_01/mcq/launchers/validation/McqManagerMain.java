package fr.iutvalence.info.but.s2_01.mcq.launchers.validation;

/**
 * McqManager validation application.
 */
public class McqManagerMain {

    /**
     * Application's main.
     * @param args command-line arguments (unused).
     */
    public static void main(String[] args) {
        // To be completed with the following guidelines!

        // create a question (called question) whose:
        // - text is "What is the answer to life, universe and everything?",
        // - answers are "42", "32768", "There is no answer", "Kamoulox",
        // - correct answer id is 0.

        // create a question (called anotherQuestion) whose
        // - text is "Another question?",
        // - answers are "I don't know", "No", "For sure", "Maybe",
        // - correct answer id is 1.

        // create a questionnaire (called questionnaire) whose:
        // author name is "Myself",
        // title is "My questionnaire",
        // questions are question and  anotherQuestion (in this order).

        // create a submission (called submission) whose:
        // filler name is "A filler",
        // answer ids are 1 and 3

        // create a manager

        // uncomment the rest ;-)
        /*
        System.out.println(manager.getQuestionnaireCount() + " questionnaire(s)");
        System.out.println("Adding a questionnaire");
        manager.addQuestionnaire(questionnaire);
        System.out.println(manager.getQuestionnaireCount() + " questionnaire(s)");
        System.out.println(manager.getQuestionnaire(questionnaire.getId()));

        System.out.println(manager.getSubmissionCount() + " submission(s)");
        System.out.println("Adding a submission");
        manager.addSubmission(submission);
        System.out.println(manager.getSubmissionCount() + " submission(s)");
        System.out.println(manager.getSubmission(submission.getId()));

        System.out.println("Removing a questionnaire");
        System.out.println(manager.removeQuestionnaire(questionnaire.getId()));
        System.out.println(manager.getQuestionnaireCount() + " questionnaire(s)");

        System.out.println("Removing a submission");
        System.out.println(manager.removeSubmission(submission.getId()));
        System.out.println(manager.getSubmissionCount() + " submission(s)");
         */
    }
}
