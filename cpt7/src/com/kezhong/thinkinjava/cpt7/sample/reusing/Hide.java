package com.kezhong.thinkinjava.cpt7.sample.reusing;


import static com.kezhong.thinkinjava.lib.Print.println;

class Homer {
    char doh(char c) {
        println("doh(char)");
        return c;
    }

    float doh(float f) {
        println("doh(float)");
        return f;
    }
}

class Milhouse{}

class Bart extends Homer {
    void doh(Milhouse m) {
        println("doh(Milhouse)");
    }
}

public class Hide {

    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }

}
