package com.example.java8.optional;

import java.util.Optional;
import java.util.Properties;

public class ComputerTest {
    public static void main(String[] args) {
        Optional<Computer> computer = Optional.of(new Computer());

        //Exception: 'map(Function<? super Optional<Soundcard>,?>)' in 'java.util.Optional' cannot be applied to '()'
        //Computer::getSoundcard 得到的是Optional<Soundcard>而不是Soundcard，后面的map需要apply执行的function入参
        // 需要是的Soundcard，.map(Soundcard::getUSB),而不是.map(Optional<Soundcard>::getUSB)
        //  computer.map(Computer::getSoundcard).map();

        // Cascading Optional Objects Using the flatMap Method
        computer.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .filter(usb -> usb.getVersion().equals("3.0"))
                .map(USB::getVersion)
                .orElse("UNKNOWN");

        // Extracting and Transforming Values Using the map Method
        computer.map(Computer::getVideocard)
                .map(VideoCard::getUSB)
                .filter(usb -> usb.getVersion().equals("3.0"))
                .map(USB::getVersion)
                .orElse("UNKNOWN");

    }

    // refactor code use optional
    public static Integer readPoint(Properties prop, String name) {
        String value = prop.getProperty(name);
        if (value != null) {
            try {
                int i = Integer.parseInt(value);
                if (i > 0) {
                    return i;
                }
            } catch (NumberFormatException numberFormatException) {

            }
        }
        return 0;
    }

    public static Integer readPointUseOptional(Properties prop, String name) {
        return Optional.ofNullable(prop).map(p -> p.getProperty(name))
                .map(v -> Integer.parseInt(v))
                .filter(i -> i > 0)
                .orElse(0);

    }
}