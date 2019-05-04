package com.jacob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
    private CD cd;

    @Autowired
    public CDPlayer(CD cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
