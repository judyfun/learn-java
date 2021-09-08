package com.example.java8.thisReference;

public class ExampleSnippit2 {

    public static void main(String... args) {
        StringBuilder message = new StringBuilder();
        Runnable r = () -> System.out.println(message);
        message.append("Howdy, ");
        message.append("world!");
        r.run();
    }
}
