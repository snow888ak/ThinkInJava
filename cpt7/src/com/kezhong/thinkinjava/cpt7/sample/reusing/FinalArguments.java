package com.kezhong.thinkinjava.cpt7.sample.reusing;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 23:05
 */
class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {

    void with(final Gizmo g) {
//        g = new Gizmo(); //Illegal -- g is final
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    //    void f(final int i) {i++;} // Can't change

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments f = new FinalArguments();
        f.with(null);
        f.without(null);
    }
}
