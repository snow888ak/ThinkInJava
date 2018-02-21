package com.kezhong.thinkinjava.cpt8.practice;

import com.kezhong.thinkinjava.cpt8.polymorphism.music.Note;

import static com.kezhong.thinkinjava.lib.Print.println;

class Violin extends Instrument {
    @Override
    public void play(Note n) { println("Violin.play() " + n); }
    @Override
    String what() { return "Violin"; }
    @Override
    void adjust() { println("Adjusting Violin"); }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:35
 */
public class Practice7 {

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new Violin()};
        Practice6.tuneAll(orchestra);
    }

}
