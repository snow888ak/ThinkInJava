package com.kezhong.thinkinjava.cpt8.practice;

import com.kezhong.thinkinjava.cpt8.polymorphism.music.Note;

import static com.kezhong.thinkinjava.lib.Print.println;

class Instrument {

    public void play(Note n) { println("Instrument.play() " + n); }
    String what() { return "Instrument"; }
    void adjust() { println("Adjusting Instrument"); }

    @Override
    public String toString() {
        return what();
    }
}

class Wind extends Instrument {
    @Override
    public void play(Note n) { println("Wind.play() " + n); }
    @Override
    String what() { return "Wind"; }
    @Override
    void adjust() { println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) { println("Percussion.play() " + n); }
    @Override
    String what() { return "Percussion"; }
    @Override
    void adjust() { println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) { println("Stringed.play() " + n); }
    @Override
    String what() { return "Stringed"; }
    @Override
    void adjust() { println("Adjusting Stringed"); }
}

class Brass extends Wind {
    @Override
    public void play(Note n) { println("Brass.play() " + n); }
    @Override
    void adjust() { println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) { println("Woodwind.play() " + n); }
    @Override
    String what() { return "Woodwind"; }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:35
 */
public class Practice6 {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            System.out.println(i);
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }

}
