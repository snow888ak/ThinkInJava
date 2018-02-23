package com.kezhong.thinkinjava.cpt8.practice;

import java.util.Random;

import static com.kezhong.thinkinjava.lib.Print.println;

/**
 * 创建Rodent(啮齿动物)：Mouse(老鼠)，Gerbil(鼹鼠)，Hamster(大颊鼠)，等等这样一个的继承层次结构。</ br>
 * 在基类中，提供对所有的Rodent都通用的方法，在导出类中，根据特定的Rodent类型覆盖这些方法，以便它们执行不同的行为。</ br>
 * 创建一个Rodent数组，填充不同的Rodent类型，然后调用基类方法，观察发生什么情况。
 */
class Rodent{
    public void eat() { println("Rodent.eat()"); }
    public void run() { println("Rodent.run()"); }
    public void sleep() { println("Rodent.sleep()"); }
}

class Mouse extends Rodent {
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

class Gerbil extends Rodent {
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

class Hamster extends Rodent {
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
            case 0: return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();
        }
    }

}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:30
 */
public class Practice9 {

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
