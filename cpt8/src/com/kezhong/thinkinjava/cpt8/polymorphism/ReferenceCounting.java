package com.kezhong.thinkinjava.cpt8.polymorphism;

import static com.kezhong.thinkinjava.lib.Print.println;

class Share {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Share() {
        println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    public void dispose() {
        if (--refcount == 0) {
            println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Share " + id;
    }
}

class Composing {
    private Share shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Share share) {
        println("Creating " + this);
        this.shared = share;
        this.shared.addRef();
    }

    public void dispose() {
        println("dispose " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:38
 */
public class ReferenceCounting {

    public static void main(String[] args) {
        Share share = new Share();
        Composing[] composing = {new Composing(share), new Composing(share), new Composing(share), new Composing(share), new Composing(share)};
        for (Composing c : composing) {
            c.dispose();
        }
    }

}
