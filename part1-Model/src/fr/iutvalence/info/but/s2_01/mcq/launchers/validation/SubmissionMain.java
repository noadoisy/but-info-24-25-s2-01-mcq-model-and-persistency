package src.fr.iutvalence.info.but.s2_01.mcq.launchers.validation;

import src.fr.iutvalence.info.but.s2_01.mcq.model.core.QuestionnaireId;
import src.fr.iutvalence.info.but.s2_01.mcq.model.core.Submission;

/**
 * Submission validation application.
 */
public class SubmissionMain {

    /**
     * Application's main.
     * @param args command-line arguments (unused).
     */
    public static void main(String[] args) {
        Submission s = new Submission(new QuestionnaireId("Noa","Mon Gourmand"),"Evgle",new int[]{1,3});

        System.out.println("Test de getFillerName");
        System.out.println(s.getFillerName());

        System.out.println("\nTest de getQuestionnaureId");
        System.out.println(s.getQuestionnaireID());

        System.out.println("\nTest de getAnswerId");
        System.out.println(s.getAnswerIds(1));

        System.out.println("\nTest de getId");
        System.out.println(s.getId());

        System.out.println("\nTest de toString");
        System.out.println(s.toString());
    }
}
