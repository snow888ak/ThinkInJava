package com.kezhong.thinkinjava.cpt7.practice;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:37
 */

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends A {

    private B b = new B();

    public C() {
        System.out.println("Class C Constructor");
    }
}

public class Practice5 {

    public static void main(String[] args) {
        C c = new C();
    }

}
