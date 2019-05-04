package com.jacob;

import org.springframework.stereotype.Component;

@Component
public class PianoCD implements CD {

    @Override
    public void play() {
        System.out.print("this is PianoCD!!!");
    }
}
