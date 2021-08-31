package com.example.java8.lambda.lesson1;

@FunctionalInterface
public interface ProjectPredicate {
    Boolean test(Project project);
}
