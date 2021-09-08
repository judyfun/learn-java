package com.example.java8.thisReference;

public class Hello {
    public Runnable r = new Runnable() {
        public void run() {
            System.out.println(this);
            System.out.println(toString());
        }
    };

    public Runnable r2 = () -> {
        // lambda 作用域的this是本对象
        System.out.println(this);
        System.out.println(toString());
    };

    public String toString() {
        return "Hello's custom toString()";
    }
}

class InnerClassExamples {
    public static void main(String... args) {
        Hello h = new Hello();
        h.r.run();
        System.out.println("========");
        h.r2.run();
    }
}
