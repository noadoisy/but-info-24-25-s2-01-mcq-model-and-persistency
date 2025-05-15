package src.fr.iutvalence.info.but.s2_01.mcq.launchers.validation;

import src.fr.iutvalence.info.but.s2_01.mcq.model.core.Question;
import src.fr.iutvalence.info.but.s2_01.mcq.model.core.Questionnaire;

/**
 * Questionnaire validation application.
 */
public class QuestionnaireMain {

    /**
     * Application's main.
     * @param args command-line arguments (unused).
     */
    public static void main(String[] args) {

        Question q0 = new Question("What is the answer to life, universe and everything?", new String[]{"42", "32768", "There is no answer", "Kamoulox"}, 0);
        Question q1 = new Question("Another question?", new String[]{"I don't know", "No", "For sure", "Maybe"}, 1);

        Questionnaire questionnaire1 = new Questionnaire("My questionnaire",new Question[]{q0,q1},"Myself");

        System.out.println(questionnaire1.toString());
        System.out.println("\nTest de getId de questionnaire");
        System.out.println(questionnaire1.getId());
    }
}
