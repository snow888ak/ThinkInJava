package com.kezhong.thinkinjava.cpt8.polymorphism;

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill{
    @Override
    Wheat process() {
        return new Wheat();
    }
}

/**
 * 协变返回类型
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 23:17
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }

}
