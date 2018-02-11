package com.kezhong.thinkinjava.cpt3;

import java.util.Random;

import static com.kezhong.thinkinjava.lib.Print.println;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:59
 */
public class Practice3 {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int max = 100;
        for (int i = 2; i <=max; i++) {
            boolean isSuShu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSuShu = false;
                    break;
                }
            }
            if (isSuShu) {
                println(String.valueOf(i));
            }
        }
        println("Time：" + (System.currentTimeMillis() - time));
    }

}
