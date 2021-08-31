package com.example.java8.defaultMethod;

public class CaculatorFacotry {

    public static BaseCaculator getInstance() {
        return new BaseCaculator();
    }
}
