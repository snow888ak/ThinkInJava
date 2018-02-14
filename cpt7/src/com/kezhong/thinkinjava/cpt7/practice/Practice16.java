package com.kezhong.thinkinjava.cpt7.practice;

import static com.kezhong.thinkinjava.lib.Print.println;

class Amphibian {

    void swim() {
        println("Amphibian swim");
    }

    static void swim(Amphibian a){
        a.swim();
    }

}

class Frog extends Amphibian {

}

class Frog2 extends Amphibian {
    @Override
    void swim() {
        println("Frog2 swim");
    }
}

public class Practice16 {

    public static void main(String[] args) {
        Amphibian.swim(new Frog());
        Amphibian.swim(new Frog2());
    }

}
