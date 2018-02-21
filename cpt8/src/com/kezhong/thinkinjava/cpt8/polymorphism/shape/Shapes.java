package com.kezhong.thinkinjava.cpt8.polymorphism.shape;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:42
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
        }
    }

}
