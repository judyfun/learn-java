package com.example.java8.flatmapAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class InStream {
    public static void main(String[] args) {

    }

    // example of a nested Collection
    public List<List<String>> nestedCollection() {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("one:one"),
                Arrays.asList("two:one", "two:two", "two:three"),
                Arrays.asList("three:one", "three:two", "three:three", "three:four"));
        return nestedList;
    }

    // flatting the list with forEach
    public <T> List<T> flattenListOfListsImperatively(
            List<List<T>> nestedList) {
        List<T> ls = new ArrayList<>();
        nestedList.forEach(ls::addAll);
        return ls;
    }

    public <T> List<T> flattenListOfListsStream(List<List<T>> list) {
        return list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
