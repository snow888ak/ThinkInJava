package com.kezhong.thinkinjava.cpt7.sample.reusing;

import static com.kezhong.thinkinjava.lib.Print.*;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:17
 */

class Plate {

    public Plate(int i) {
        println("Plate Constructor");
    }
}

class DinnerPlate extends Plate {

    public DinnerPlate(int i) {
        super(i);
        println("DinnerPlate Constructor");
    }
}

class Utensil {

    public Utensil(int i) {
        println("Utensil Constructor");
    }
}

class Spoon extends Utensil {

    public Spoon(int i) {
        super(i);
        println("Spoon Constructor");
    }
}

class Fork extends Utensil {

    public Fork(int i) {
        super(i);
        println("Fork Constructor");
    }
}

class Knife extends Utensil {

    public Knife(int i) {
        super(i);
        println("Knife Constructor");
    }
}

class Custom {
    public Custom(int i) {
        println("Custom Constructor");
    }
}

public class PlaceSetting extends Custom{

    private Spoon sp;
    private Fork fk;
    private Knife kn;
    private DinnerPlate dp;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        fk = new Fork(i + 3);
        kn = new Knife(i + 4);
        dp = new DinnerPlate(i + 5);
        println("PlaceSetting Constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
