package com.kezhong.thinkinjava.cpt3;

import java.util.Random;

import static com.kezhong.thinkinjava.lib.Print.println;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:59
 */
public class Practice2 {

    public static void main(String[] args) {
        //记录生成的上一个数
        int last = 0;
        int cur = 0;
        Random random = new Random(47);
        for (int i = 0, count = 25; i < count; i++) {
            cur = random.nextInt(10);
            if (i > 0) {
                println(last + " compare " + cur + " = " + compare(last, cur));
            }
            last = cur;
        }
    }

    private static int compare(int source, int target) {
        if (source > target) {
            return 1;
        } else if (source == target) {
            return 0;
        } else {
            return -1;
        }
    }

}
