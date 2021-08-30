package java8.lambda.lesson3;

import java.util.function.Function;

public class OtherReference {

    public static void main(String[] args) {
        Function<Integer, Integer[]> arrayGenerator = x -> new Integer[x];
        Integer[]                    array          = arrayGenerator.apply(10);
        System.out.println(array.length);

        Function<Integer, Integer[]> fun1 = Integer[]::new;
        array = fun1.apply(34);
        System.out.println(array.length);


    }
}
