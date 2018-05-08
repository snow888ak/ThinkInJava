package com.kezhong.thinkinjava.cpt9.interfaces.filters;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:18
 */
public class BandPass extends Filter{
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
