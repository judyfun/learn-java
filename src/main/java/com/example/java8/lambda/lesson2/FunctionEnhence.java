package com.example.java8.lambda.lesson2;

import java.util.function.Function;

@FunctionalInterface
public interface FunctionEnhence extends Function {
    default <A, B, C> Function<A, C> composeEnhence(Function<A, B> f1, Function<B, C> f2) {
        return f1.andThen(f2);
    }
}
