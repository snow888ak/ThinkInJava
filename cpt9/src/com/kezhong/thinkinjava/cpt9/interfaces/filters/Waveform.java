package com.kezhong.thinkinjava.cpt9.interfaces.filters;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:16
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
