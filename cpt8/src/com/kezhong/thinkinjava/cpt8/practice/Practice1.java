package com.kezhong.thinkinjava.cpt8.practice;

import static com.kezhong.thinkinjava.lib.Print.println;

/**
 * 创建一个Cycle类，它具有子类Unicycle，Bicycle和Tricycle
 */
class Cycle {

    public void ride() {
        println(wheels() + " wheels ride");
    }

    public int wheels() {
        return 0;
    }

}

class Unicycle extends Cycle {
    @Override
    public void ride() {
        println("Unicycle.ride()");
        super.ride();
    }

    @Override
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        println("Bicycle.ride()");
        super.ride();
    }

    @Override
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        println("Tricycle.ride()");
        super.ride();
    }

    @Override
    public int wheels() {
        return 3;
    }
}
/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:26
 */
public class Practice1 {

    public static void ride(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }

}
