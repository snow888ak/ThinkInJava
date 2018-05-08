package com.kezhong.thinkinjava.cpt9.interfaces.classprocessor;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:24
 */
public interface Processor {
    String name();
    Object process(Object input);
}
