package java8.growing.jdk8;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<Object> fullName = Optional.ofNullable("Leon");
        System.out.println("Full Name is set? "+fullName.isPresent());
        System.out.println("Full Name: "+fullName.orElse("[None]"));
        System.out.println(fullName.map(s -> "Hey "+ s +" !").orElse("Hey Stranger"));


    }
}
