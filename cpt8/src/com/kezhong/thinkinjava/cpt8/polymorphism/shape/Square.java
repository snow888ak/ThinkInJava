package com.kezhong.thinkinjava.cpt8.polymorphism.shape;

import static com.kezhong.thinkinjava.lib.Print.println;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:38
 */
public class Square extends Shape {

    @Override
    public void draw() {
        println("Square.draw()");
    }

    @Override
    public void erase() {
        println("Square.erase()");
    }
}
