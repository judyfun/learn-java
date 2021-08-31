package com.example.java8.defaultMethod;

public class UseCaculator {

    public static void main(String[] args) {
        BaseCaculator caculator = new BaseCaculator();
        caculator.add(1, 3);
        caculator.mod(4, 2);

        BaseCaculator caculator1 = CaculatorFacotry.getInstance();
        caculator1.add(3, 4);
        caculator1.mod(8, 4);
    }
}
