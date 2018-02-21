package com.kezhong.thinkinjava.cpt8.practice;

import java.util.Random;

class RandomInstrumentGenerator {
    private Random random = new Random(47);

    public Instrument next() {
        switch (random.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Woodwind();
            case 4: return new Brass();
            case 5: return new Violin();
        }
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:40
 */
public class Practice8 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[20];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = gen.next();
        }
        Practice6.tuneAll(orchestra);
    }
}
