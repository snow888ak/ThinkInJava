package com.kezhong.thinkinjava.cpt7.practice;

import com.kezhong.thinkinjava.cpt7.sample.reusing.Detergent;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:40
 */
class SubDetergent extends Detergent {
    @Override
    public void scrub() {
        append(" SubDetergent.scrub()");
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        SubDetergent subDetergent = new SubDetergent();
        subDetergent.dilute();
        subDetergent.apply();
        subDetergent.scrub();
        subDetergent.foam();
        subDetergent.sterilize();
        System.out.println(subDetergent);
    }
}

public class Practice2 {

    public static void main(String[] args) {
        SubDetergent.main(args);
    }

}
