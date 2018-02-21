package com.kezhong.thinkinjava.cpt7.sample.reusing;

import static com.kezhong.thinkinjava.lib.Print.println;


class WithFinals {
    private final void f() {
        println("WithFinals.f()");
    }

    private final void g() {
        println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        println("OverridingPrivate.f()");
    }

    private final void g() {
        println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        println("OverridingPrivate2.f()");
    }

    public void g() {
        println("OverridingPrivate2.g()");
    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 16:26
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
//        op.f();
//        op.g();
        WithFinals wf = op2;
//        wf.f();
//        wf.g();
    }
}
