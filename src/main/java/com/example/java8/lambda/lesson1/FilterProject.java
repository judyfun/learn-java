package com.example.java8.lambda.lesson1;

import com.example.java8.lambda.lesson1.predicate.LanguagePredicate;
import com.example.java8.lambda.lesson1.predicate.StarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterProject {

    /**
     * filter by java
     */
    public static List<Project> filterJavaProjects(List<Project> projects) {
        List<Project> result = new ArrayList<>();
        for (Project p : projects) {
            if ("java".equals(p.getLanguage())) {
                result.add(p);
            }
        }
        return result;
    }

    /**
     * filter by language
     *
     * @param projects
     * @param language
     * @return
     */
    public static List<Project> filterByLanguage(List<Project> projects, String language) {
        List<Project> result = new ArrayList<>();
        for (Project p : projects) {
            if (language.equals(p.getLanguage())) {
                result.add(p);
            }
        }
        return result;
    }

    /**
     * filter by language and star
     *
     * @param projects
     * @param language
     * @param star
     * @return
     */
    public static List<Project> filterByLanguageAndStar(List<Project> projects, String language, Integer star) {
        List<Project> result = new ArrayList<>();
        for (Project p : projects) {
            if (language.equals(p.getLanguage())) {
                if (p.getStars() > star) {
                    result.add(p);
                }
            }
        }
        return result;
    }

    /**
     * filter by pridicate
     *
     * @param projects
     * @param predicate
     * @return
     */
    public static List<Project> filterProjects(List<Project> projects, ProjectPredicate predicate) {
        List<Project> result = new ArrayList<>();
        for (Project p : projects) {
            if (predicate.test(p)) {
                result.add(p);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Project> data = new ArrayList<>();
        data.add(Project.builder().name("Blade").language("java").author("biezhi")
                .stars(3500).description("Lightning fast and elegant mvc framework for Java8").build());

        data.add(Project.builder().name("Tale").language("java").author("biezhi")
                .stars(2600).description("Best beautiful java blog, worth a try").build());

        data.add(Project.builder().name("Vue.js").language("js").author("yyx990803")
                .stars(83000).description("A progressive, incrementally-adoptable JavaScript framework for building UI on the web.").build());

        data.add(Project.builder().name("Flask").language("python").author("pallets")
                .stars(10500).description("The Python micro framework for building web applications").build());

        data.add(Project.builder().name("Elves").language("java").author("biezhi")
                .stars(200).description("Spider").build());


        filterJavaProjects(data);
        filterByLanguage(data, "Java");
        filterByLanguage(data, "Golang");
        filterByLanguageAndStar(data, "Java", 1000);

        //
        filterProjects(data, new LanguagePredicate("java"));
        filterProjects(data, new StarPredicate(1000));
        filterProjects(data, project -> project.getStars() > 1000);

        List<Project> filter = filter(data, project -> project.getStars() > 1000);
    }
}
