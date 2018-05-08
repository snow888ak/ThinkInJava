package com.kezhong.thinkinjava.cpt9.interfaces.filters;

import com.kezhong.thinkinjava.cpt9.interfaces.classprocessor.Apply;
import com.kezhong.thinkinjava.cpt9.interfaces.classprocessor.Processor;

class FilterAdapter implements Processor {

    private Filter mFilter;

    FilterAdapter(Filter mFilter) {
        this.mFilter = mFilter;
    }

    @Override
    public String name() {
        return mFilter.name();
    }

    @Override
    public Waveform process(Object input) {
        return mFilter.process((Waveform)input);
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 23:24
 */
public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }

}
