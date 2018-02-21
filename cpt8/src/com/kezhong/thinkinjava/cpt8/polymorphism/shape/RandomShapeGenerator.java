package com.kezhong.thinkinjava.cpt8.polymorphism.shape;

import java.util.Random;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:40
 */
public class RandomShapeGenerator {

    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

}
