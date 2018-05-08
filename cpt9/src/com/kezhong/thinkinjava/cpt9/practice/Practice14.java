package com.kezhong.thinkinjava.cpt9.practice;
interface I{
    void i1();
    void i2();
}

interface G{
    void g1();
    void g2();
}

interface H {
    void h1();
    void h2();
}

interface M extends I, G, H {
    void m1();
}

class F {

}

class FSub extends F implements M {

    @Override
    public void i1() {

    }

    @Override
    public void i2() {

    }

    @Override
    public void g1() {

    }

    @Override
    public void g2() {

    }

    @Override
    public void h1() {

    }

    @Override
    public void h2() {

    }

    @Override
    public void m1() {

    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:54
 */
public class Practice14 {

    static void i(I i) {
        i.i1();
        i.i2();
    }
    static void g(G g) {
        g.g1();
        g.g2();
    }

    static void h(H h) {
        h.h1();
        h.h2();
    }

    static void m(M m) {
        m.m1();
    }

    public static void main(String[] args) {
        FSub f = new FSub();
        i(f);
        g(f);
        h(f);
        m(f);
    }

}
