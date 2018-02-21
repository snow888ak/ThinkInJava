package com.kezhong.thinkinjava.cpt7.practice;

import com.kezhong.thinkinjava.cpt7.sample.reusing.Detergent;

/**
 * 从Detergent中继承产生一个新的类。覆盖scrub()并添加一个名为sterilize()的新方法
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

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:40
 */
public class Practice2 {

    public static void main(String[] args) {
        SubDetergent.main(args);
    }

}
