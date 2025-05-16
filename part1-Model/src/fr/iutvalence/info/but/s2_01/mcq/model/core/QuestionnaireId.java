package src.fr.iutvalence.info.but.s2_01.mcq.model.core;

import java.util.Objects;

/**
 * Questionnaire unique id, made of author name and title.
 */
public class QuestionnaireId  {
    private final String authorName;
    public static final String SEPARATOR ="#";
    private final String title;

    public QuestionnaireId(String authorName, String title) {
        this.authorName = authorName;
        this.title = title;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        QuestionnaireId that = (QuestionnaireId) o;
        return Objects.equals(this.authorName, that.authorName) && Objects.equals(this.title, that.title);
    }

    public int hashCode() {
        return Objects.hash(this.authorName,this.title);
    }

    public String toString() {
        return this.authorName+SEPARATOR+this.title;
    }

}