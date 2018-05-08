package com.kezhong.thinkinjava.cpt9.interfaces.classprocessor;

import java.util.Arrays;

import static com.kezhong.thinkinjava.lib.Print.println;

class Upcase extends StringProcessor {

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 21:38
 */
public class Apply {
    public static void process(Processor p, Object s) {
        println("User processor " + p.name());
        println(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}


