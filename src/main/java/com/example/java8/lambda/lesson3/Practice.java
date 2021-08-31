package com.example.java8.lambda.lesson3;


import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * 等效的方法引用是什么
 */
public class Practice {
    Function<String, Integer>         stringToInteger = (String s) -> Integer.parseInt(s);
    BiPredicate<List<String>, String> contains        = (list, element) -> list.contains(element);


}
