package com.example.java8.otherDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class InterferenceStreams {

    public static void main(String[] args) {
        dem03();
    }

    public static void dem03() {
        int[] ints = {1,2,3,4,5,6,7,8,9};
        int reduce = Arrays.stream(ints).parallel()
                .reduce(100, (i, j) -> i + j);

        int reduce1 = Arrays.stream(ints)
                .reduce(100, (i, j) -> i + j);

        System.out.println(reduce);
        System.out.println(reduce1);
    }

    public static void demo2() {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        int sumOfWeights = nums.stream()
                .reduce(0,
                        (sum, b) -> sum + b);
        System.out.println(sumOfWeights);
        Integer reduce = nums.stream()
                .reduce(0,
                        (sum, b) -> sum + b, Integer::sum);

        System.out.println(reduce);
    }

    public static void demo() {
        int[] ints = IntStream.range(0, 5).parallel().map(x -> x * 2).toArray();
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static void demo1A() {
        List<String>   l  = new ArrayList(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        l.add("three");
        String s = sl.collect(joining(" "));
        System.out.println(s);
    }

}
