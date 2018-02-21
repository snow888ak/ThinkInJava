package com.kezhong.thinkinjava.cpt8.practice;

import com.kezhong.thinkinjava.cpt8.polymorphism.shape.*;

import java.util.Random;

import static com.kezhong.thinkinjava.lib.Print.println;
/**
 * 向Shapes中添加一个新的Shape类型，并在main()方法中验证：多态对新类型的作用是否与旧类型中一样。
 */

class Pentagon extends Shape {

    @Override
    public void draw() {
        println("Pentagon.draw()");
    }

    @Override
    public void erase() {
        println("Pentagon.erase()");
    }
}

class RandomShapeGenerator2 extends RandomShapeGenerator {
    private Random random = new Random(47);

    @Override
    public Shape next() {
        switch (random.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Pentagon();
        }
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:48
 */
public class Practice4{
    private static RandomShapeGenerator gen = new RandomShapeGenerator2();

    public static void main(String[] args) {
        Shape[] s = new Shape[20];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
        }
    }
}
