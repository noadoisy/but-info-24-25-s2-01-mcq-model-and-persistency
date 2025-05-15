package src.fr.iutvalence.info.but.s2_01.mcq.model.core;

import java.util.Arrays;

/**
 * Question of a questionnaire (question, answers, correct answer id).
 */
public class Question  {
    private final String question;
    private final String[] answers;
    private final int correctAnswerId;

    public Question(String question, String[] answers, int correctAnswerId) {
        this.question = question;
        this.answers = answers;
        this.correctAnswerId = correctAnswerId;
    }

    public String getQuestion() {
        return this.question;
    }

    public int getCorrectAnswerId() {
        return this.correctAnswerId;
    }

    public String getAnswer(int answerId) {
        if (answerId>this.getAnswerCount()-1){
            return null;
        }
        return this.answers[answerId];
    }

    public int getAnswerCount(){
        return this.answers.length;
    }

    public String toString() {
        String result = "? -> "+this.question;
        for (int i = 0; i<this.getAnswerCount(); i++){
            if (this.correctAnswerId==i){
                result+="\n"+i+" -> (o) "+this.answers[i];
            }
            else {
                result += "\n"+i+" -> (x) "+this.answers[i];
            }
        }
        return result;
    }
}
