package com.kezhong.thinkinjava.cpt8.polymorphism.music;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:21
 */
public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind);
    }

}
