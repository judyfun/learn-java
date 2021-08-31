package com.example.java8.lambda.lesson3;

import com.example.java8.lambda.lesson2.Address;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 方法引用
 * 1，指向静态方法的方法引用
 * 2， 指向现有对象的实力的方法引用
 */
public class MethodReference {

    public static List<Integer> findNumbers(List<Integer> numbers, Predicate<Integer> filter) {
        return numbers.stream().filter(filter).collect(Collectors.toList());
    }

    public static boolean multipleOf3(Integer num) {
        return (num % 3) == 0;
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12);
        findNumbers(numbers, MethodReference::multipleOf3);

        Address                   address    = new Address("Australia");
        Function<Address, String> mapFuncion = addr -> addr.getCountry();
        Arrays.asList(address).stream()
                .map(mapFuncion)
                .count();
    }
}
