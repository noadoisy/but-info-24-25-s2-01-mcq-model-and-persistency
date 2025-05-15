package src.fr.iutvalence.info.but.s2_01.mcq.model.core;

/**
 * Questionnaire (sequence of questions).
 */
public class Questionnaire  {
    private String title;
    private final Question[] questions;
    private String authorName;

    public Questionnaire(String theTitle, Question[] theQuestions, String theAuthorName) {
        this.title = theTitle;
        this.questions = theQuestions;
        this.authorName = theAuthorName;
    }

    public String toString() {
        String result = "";
        result+="Title :"+this.title;
        result+="\nAuthor :"+this.authorName;
        result+="\n"+this.getQuestionCount()+" question(s)";
        for (int i=0;i<this.getQuestionCount();i++){
            result+="\nQuestion "+i;
            result+="\n"+this.questions[i].toString();
        }
        return result;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public int getQuestionCount(){
        return this.questions.length;
    }

    public Question getQuestion(int questionId){
        if (this.getQuestionCount()-1<questionId){
            return null;
        }
        return this.questions[questionId];
    }

    public QuestionnaireId getId(){
        return new QuestionnaireId(this.authorName,this.title);
    }

}