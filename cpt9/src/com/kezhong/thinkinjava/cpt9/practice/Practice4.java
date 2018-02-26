package com.kezhong.thinkinjava.cpt9.practice;

import com.sun.istack.internal.NotNull;

abstract class SuperP4 {
    abstract void print();
}

class SubP4 extends SuperP4 {
     @Override
     void print() {
         System.out.println("SubP4");
     }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 23:19
 */
public class Practice4 {

    public static void println(SuperP4 superP4) {
        superP4.print();
    }

    public static void main(String[] args) {
        println(new SubP4());
    }

}
