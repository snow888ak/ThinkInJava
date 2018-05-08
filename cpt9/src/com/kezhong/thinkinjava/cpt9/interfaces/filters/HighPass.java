package com.kezhong.thinkinjava.cpt9.interfaces.filters;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:18
 */
public class HighPass extends Filter{
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
