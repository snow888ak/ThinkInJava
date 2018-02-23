package com.kezhong.thinkinjava.cpt8.practice;

import com.kezhong.thinkinjava.cpt8.polymorphism.Sandwich;

import static com.kezhong.thinkinjava.lib.Print.println;

class Cheese {
    Cheese() {
        println("Cheese()");
    }
}

class Pickle {

    private Cheese pc = new Cheese();

    Pickle() {
        println("Pickle()");
    }

}

class PickleCheese extends Pickle {

    PickleCheese() {
        println("PickleCheese()");
    }

}


/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:37
 */
public class Practice11 extends Sandwich{

    private PickleCheese p = new PickleCheese();

    public Practice11() {
        println("Practice11()");
    }

    public static void main(String[] args) {
        new Practice11();
    }

}
