package com.example.java8.flatmapAndMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InOptional {

    public static void main(String[] args) {
        InOptional op = new InOptional();
        op.complex();
    }

    public void simple() {
        Optional<String> s = Optional.of("test");
        assertEquals(Optional.of("TEST"), s.map(String::toUpperCase));
    }

    public void complex() {
        assertEquals(Optional.of(Optional.of("string")),
                Optional.of("string").map(s -> Optional.of("string")));
    }

    // The map() method wraps the underlying sequence in a Stream instance,
    // whereas the flatMap() method allows avoiding nested Stream<Stream<R>> structure.
    public void map() {
        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("A", "B"), myList);
    }

    public void flatMap() {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
        System.out.println(list);

        System.out.println(list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }
}
