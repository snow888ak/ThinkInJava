package com.kezhong.thinkinjava.cpt8.polymorphism;

import static com.kezhong.thinkinjava.lib.Print.println;

class Glyph {
    void draw() {
        println("Glyph.draw()");
    }

    Glyph() {
        println("Glyph before draw()");
        draw();
        println("Glyph after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    private Long mRadius = 5L;
    private short s1 = 1;
    private byte b1 = 1;
    private long l1 = 1L;
    private boolean bool1 = true;
    private boolean bool2 = false;
    private float f1 = 10.0f;
    private double d1 = 10.0d;
    private String str1 = "hello";
    private char c1 = 'a';
    RoundGlyph(int r) {
        radius = r;
        println("RoundGlyph.RoundGlyph(), radius + " + radius);
    }

    @Override
    void draw() {
        println("RoundGlyph.draw(), radius + " + radius);
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:58
 */
public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
    }

}
