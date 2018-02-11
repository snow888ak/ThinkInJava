package com.kezhong.thinkinjava.cpt7.practice;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:48
 */
public class Practice9 {

    public static void main(String[] args) {
        Stem stem = new Stem();
    }

}

class Root {
    private Component1 component1 = new Component1();
    private Component2 component2 = new Component2();
    private Component3 component3 = new Component3();

    public Root() {
        System.out.println("Root constructor");
    }
}

class Stem extends Root{
    private Component1 component1 = new Component1();
    private Component2 component2 = new Component2();
    private Component3 component3 = new Component3();

    public Stem() {
        System.out.println("Stem constructor");
    }
}

class Component1 {
    public Component1() {
        System.out.println("Component1 constructor");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2 constructor");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3 constructor");
    }
}
