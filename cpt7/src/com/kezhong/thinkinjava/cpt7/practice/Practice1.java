package com.kezhong.thinkinjava.cpt7.practice;

import static com.kezhong.thinkinjava.lib.Print.println;

/**
 * 创建一个简单的类，在第二个类中，将一个引用定义为第一个类的对象。运用惰性初始化来实例化对象。
 */
class POneA {
    POneA() {
        println("POneA constructor");
    }

    protected void f() {
        println("POneA.f()");
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 16:59
 */
public class Practice1 {
    private POneA a;

    Practice1() {
        println("Practice1 constructor");
    }

    void f() {
        println("Practice1.f()");
        if (a == null) {
            a = new POneA();
        }
        a.f();
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        p.f();
    }
}
