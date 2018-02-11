package com.kezhong.thinkinjava.cpt7.practice;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:37
 */

class A1 {
    public A1(int i) {
        System.out.println("Class A1 Constructor");
    }
}

class B1 {
    public B1(int i) {
        System.out.println("Class B1 Constructor");
    }
}

class C1 extends A1 {

    private B1 b = new B1(1);

    public C1(int i) {
        super(i);
        System.out.println("Class C1 Constructor");
    }
}

public class Practice7 {

    public static void main(String[] args) {
        C1 c = new C1(1);
    }

}
