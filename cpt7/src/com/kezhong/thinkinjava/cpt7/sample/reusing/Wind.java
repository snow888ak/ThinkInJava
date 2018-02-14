package com.kezhong.thinkinjava.cpt7.sample.reusing;

import static com.kezhong.thinkinjava.lib.Print.println;

class Instrument {
    void play(){}
    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {

    @Override
    void play() {
        println("Wind play!");
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        Instrument.tune(wind);
    }
}
