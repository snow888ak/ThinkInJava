package com.kezhong.thinkinjava.cpt8.polymorphism.music;

import static com.kezhong.thinkinjava.lib.Print.println;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:20
 */
public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        println("Wind.play() " + n);
    }
}
