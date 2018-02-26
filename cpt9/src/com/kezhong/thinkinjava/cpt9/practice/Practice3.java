package com.kezhong.thinkinjava.cpt9.practice;

abstract class Print{
    Print(){
        print();
    }
    abstract void print();
}

class IntPrint extends Print {

    private int value = 10;

    @Override
    void print() {
        System.out.println("value = " + value);
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 23:16
 */
public class Practice3 {

    public static void main(String[] args) {
        Print p = new IntPrint();
    }

}
