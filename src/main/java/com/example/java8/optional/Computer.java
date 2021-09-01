package com.example.java8.optional;

import java.util.Optional;

public class Computer {
    private Optional<Soundcard> soundcard;
    private VideoCard           videocard;

    public Optional<Soundcard> getSoundcard() {
        return this.soundcard;
    }

    public VideoCard getVideocard() {
        return this.videocard;
    }

}
