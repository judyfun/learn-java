package com.example.java8.lambda.lesson3;

import java.util.function.Supplier;

/**
 * Constructor Reference
 * 对于现有的构造器，可以利用他的名字和关键字new，创建他的一个引用ClassName::new
 * 他的功能与指向静态的方法引用类似
 */
public class ContructorReference {

    public static void main(String[] args) {
        Supplier<ContructorReference> sup                 = ContructorReference::new;
        ContructorReference           contructorReference = sup.get();
    }
}
