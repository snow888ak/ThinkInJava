package com.kezhong.thinkinjava.cpt8.polymorphism;

import static com.kezhong.thinkinjava.lib.Print.println;

class Meal {
    Meal() {
        println("Meal()");
    }
}

class Bread {
    Bread() {
        println("Bread()");
    }
}

class Cheese {
    Cheese() {
        println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        println("PortableLunch()");
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:30
 */
public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

}
