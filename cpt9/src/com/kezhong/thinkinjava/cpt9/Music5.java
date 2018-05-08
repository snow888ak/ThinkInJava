package com.kezhong.thinkinjava.cpt9;

import static com.kezhong.thinkinjava.lib.Print.println;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

interface Instrument {
    int VALUE = 5;
    void adjust();
}

interface Playable {
    void play(Note n);
}


abstract class BaseInstrument implements Instrument, Playable{
    @Override
    public void play(Note n) { println(this + ".play() " + n); }
    @Override
    public void adjust() { println(this + ".adjust() "); }

}

class Wind extends BaseInstrument {
    @Override
    public String toString() { return "Wind";}
}

class Percussion extends BaseInstrument {
    @Override
    public String toString() { return "Percussion";}
}

class Stringed extends BaseInstrument {
    @Override
    public String toString() { return "Stringed";}
}

class Brass extends Wind {
    @Override
    public String toString() { return "Brass";}
}

class Woodwind extends Wind {
    @Override
    public String toString() { return "Woodwind";}
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:21
 */
public class Music5 {
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for (Playable i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }
}
