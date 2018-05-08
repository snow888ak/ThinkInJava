package com.kezhong.thinkinjava.cpt9.practice;

import com.kezhong.thinkinjava.cpt9.interfaces.classprocessor.Apply;
import com.kezhong.thinkinjava.cpt9.interfaces.classprocessor.Processor;

class StrCharge {

    public String process(String s) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 <= s.length() - 1) {
                sBuffer.append(s.charAt(i+1));
            }
            sBuffer.append(s.charAt(i));
        }
        return sBuffer.toString();
    }

}

class ChargeAdapter implements Processor {

    private StrCharge charge;

    ChargeAdapter(StrCharge charge) {
        this.charge = charge;
    }

    @Override
    public String name() {
        return charge.getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return charge.process((String)input);
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 23:27
 */
public class Practice11 {

    public static String s = "Think in Java";

    public static void main(String[] args) {
        Apply.process(new ChargeAdapter(new StrCharge()), s);
    }

}
