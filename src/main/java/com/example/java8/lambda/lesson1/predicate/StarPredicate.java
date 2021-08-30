package java8.lambda.lesson1.predicate;

import com.example.java8.lambda.lesson1.Project;
import com.example.java8.lambda.lesson1.ProjectPredicate;

public class StarPredicate implements ProjectPredicate {
    private Integer star;

    public StarPredicate(Integer star) {
        this.star = star;
    }

    @Override
    public Boolean test(Project project) {
        return star == project.getStars();
    }
}
