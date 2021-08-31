package com.example.java8.lambda.lesson2;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
public interface SupplierFunctor<T> extends Supplier<T> {

    /**
     * Returns a composed function that first applies this supplier to its input, and then applies the after function to the result.
     * @param after
     * @param <R>
     * @return
     */
    default <R> SupplierFunctor<R> andThen(Function<T, R> after) {
        Objects.requireNonNull(after);
        return () -> after.apply(this.get());
    }
}
