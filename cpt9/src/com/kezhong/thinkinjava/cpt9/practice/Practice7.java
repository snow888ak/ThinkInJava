package com.kezhong.thinkinjava.cpt9.practice;

import java.util.Random;

import static com.kezhong.thinkinjava.lib.Print.println;

interface Rodent {
    void eat();

    void run();

    void sleep();
}

class Mouse implements Rodent {
    @Override
    public void eat() {
        println("Mouse.eat()");
    }

    @Override
    public void run() {
        println("Mouse.run()");
    }

    @Override
    public void sleep() {
        println("Mouse.sleep()");
    }
}

class Gerbil implements Rodent {
    @Override
    public void eat() {
        println("Gerbil.eat()");
    }

    @Override
    public void run() {
        println("Gerbil.run()");
    }

    @Override
    public void sleep() {
        println("Gerbil.sleep()");
    }
}

class Hamster implements Rodent {
    @Override
    public void eat() {
        println("Hamster.eat()");
    }

    @Override
    public void run() {
        println("Hamster.run()");
    }

    @Override
    public void sleep() {
        println("Hamster.sleep()");
    }
}

class RandomRodentGenerator {
    private Random random = new Random();

    public Rodent next() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Gerbil();
            case 2:
                return new Hamster();
        }
    }

}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:17
 */
public class Practice7 {

    public static void main(String[] args) {
        RandomRodentGenerator gen = new RandomRodentGenerator();
        Rodent[] rodents = new Rodent[20];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = gen.next();
        }
        for (Rodent rod : rodents) {
            rod.run();
            rod.eat();
            rod.sleep();
        }
    }

}
