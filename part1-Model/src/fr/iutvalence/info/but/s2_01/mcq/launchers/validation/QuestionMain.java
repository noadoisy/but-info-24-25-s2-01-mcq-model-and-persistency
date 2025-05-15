package src.fr.iutvalence.info.but.s2_01.mcq.launchers.validation;

import src.fr.iutvalence.info.but.s2_01.mcq.model.core.Question;

/**
 * Question validation application.
 */
public class QuestionMain {

    /**
     * Application's main.
     * @param args command-line arguments (unused).
     */
    public static void main(String[] args) {
        System.out.println("Test de toString\n");
        Question q1 =
                new Question("What is the answer to life, universe and everything?",
                        new String[]{"42", "32768", "There is no answer", "Kamoulox"},
                        0);
        System.out.println(q1.toString());

        System.out.println("\nTest de la methode getAnswer");
        System.out.println(q1.getAnswer(5));
        System.out.println(q1.getAnswer(2));

        System.out.println("\nTest de la methode getCorrectAnswerId");
        System.out.println(q1.getCorrectAnswerId());

        System.out.println("\nTest de la methode getAnswerCount");
        System.out.println(q1.getAnswerCount());

        System.out.println("\nTest de la methode getQuestion");
        System.out.println(q1.getQuestion());
    }
}