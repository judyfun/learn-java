package com.example.java8.optional;

import java.util.Optional;

public class ComputerTest {
    public static void main(String[] args) {
        Optional<Computer> computer = Optional.of(new Computer());

        //'map(java.util.function.Function<? super java.util.Optional<com.example.java8.optional.Soundcard>,?>)' in 'java.util.Optional' cannot be applied to '()'
        //Computer::getSoundcard 得到的是Optional<Soundcard>而不是Soundcard，后面的map需要apply执行的function入参
        // 需要是的Soundcard，.map(Soundcard::getUSB),而不是.map(Optional<Soundcard>::getUSB)
//        computer.map(Computer::getSoundcard).map();

        computer.flatMap(Computer::getSoundcard).flatMap(Soundcard::getUSB)
                .filter(usb -> usb.getVersion().equals("3.0"))
                .map(USB::getVersion)
                .orElse("UNKNOWN");

        computer.map(Computer::getVideocard)
                .map(VideoCard::getUSB)
                .filter(usb -> usb.getVersion().equals("3.0"))
                .map(USB::getVersion)
                .orElse("UNKNOWN");

    }
}
