package com.kezhong.thinkinjava.cpt9.interfaces.filters;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:17
 */
public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
