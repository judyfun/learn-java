package java8.lambda.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Function;

/**
 * Lambda异常
 * https://stackoverflow.com/questions/18198176/java-8-lambda-function-that-throws-exception
 */
public class LambdaException {
    public static void main(String[] args) {
        Function<BufferedReader, String> f = (BufferedReader b) -> {
            try {
                return b.readLine();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        };
    }
}
