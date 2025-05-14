package fr.iutvalence.info.but.s2_01.mcq.launchers.validation;

import fr.iutvalence.info.but.s2_01.mcq.model.core.*;
import fr.iutvalence.info.but.s2_01.mcq.storage.core.FileSystemStorage;
import fr.iutvalence.info.but.s2_01.mcq.storage.core.Storage;
import fr.iutvalence.info.but.s2_01.mcq.storage.exceptions.StorageAccessException;

import java.io.File;
import java.util.Map;

/**
 * Storage validation application.
 */
public class StorageMain {

    /**
     * Application's main.
     * @param args command-line arguments (unused).
     */
    public static void main(String[] args) {
        // to be completed with following guidelines!

        // Create a new manager (called manager)

        // Create a new file system storage (called storage), using ./resources as root directory
        // -> if storage access fails, write error message to standard output and exit

        // Set manager storage

        // *** the following can be copied/pasted from McqManagerMain
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
        // ***

        // (uncomment)
        /*
        System.out.println("Adding a questionnaire");
        System.out.println(questionnaire);
        */

        // Add questionnaire to manager

        // *** the following can be copied/pasted from McqManagerMain
        // create a submission (called submission) whose:
        // filler name is "A filler",
        // answer ids are 1 and 3
        // ***

        // (uncomment)
        /*
        System.out.println("Adding a submission");
        System.out.println(submission);
        */

        // Add submission to manager

        // create another submission (called submission2) whose:
        // filler name is "Serial filler",
        // answer ids are 0 and 2

        // (uncomment)
        /*
        System.out.println("Adding a submission");
        System.out.println(submission2);
        */

        // Add submission to manager

        // (uncomment)
        /*
        System.out.println(manager.getQuestionnaireCount() + " questionnaire(s)");
        System.out.println(manager.getSubmissionCount() + " submission(s)");
        */

        // (uncomment)
        /*
        System.out.println("Saving all");
        */

        // Save all questionnaires/submissions to storage
        // -> if storage access fails, write error message to standard output and exit

        // (uncomment)
        /*
        System.out.println("Replacing manager with a new one using same storage");
        */

        // replace manager by a new one (this causes all questionnaires/submissions to be lost

        // (uncomment)
        /*
        System.out.println(manager.getQuestionnaireCount() + " questionnaire(s)");
        System.out.println(manager.getSubmissionCount() + " submission(s)");
        */

        // Set manager storage

        // (uncomment)
        /*
        System.out.println("Loading all");
         */

        // Load all questionnaires/submissions from storage
        // -> if storage access fails, write error message to standard output and exit

        // (uncomment)
        /*
        System.out.println(manager.getQuestionnaireCount() + " questionnaire(s)");
        System.out.println(manager.getSubmissionCount() + " submission(s)");
        System.out.println(manager.getQuestionnaire(questionnaire.getId()));
        System.out.println(manager.getSubmission(submission.getId()));
        System.out.println(manager.getSubmission(submission2.getId()));
        */
    }
}
