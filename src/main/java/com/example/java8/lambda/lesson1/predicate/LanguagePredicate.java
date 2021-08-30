package java8.lambda.lesson1.predicate;

import com.example.java8.lambda.lesson1.Project;
import com.example.java8.lambda.lesson1.ProjectPredicate;

public class LanguagePredicate implements ProjectPredicate {
    private String language;

    public LanguagePredicate(String language) {
        this.language = language;
    }

    @Override
    public Boolean test(Project project) {
        return language.equals(project.getLanguage());
    }
}
