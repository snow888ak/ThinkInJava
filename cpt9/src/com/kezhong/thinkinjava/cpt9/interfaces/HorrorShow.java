package com.kezhong.thinkinjava.cpt9.interfaces;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destory();
}

interface Lethal{
    void kill();
}

class DergonZilla implements DangerousMonster {

    @Override
    public void menace() {

    }

    @Override
    public void destory() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {

    @Override
    public void menace() {

    }

    @Override
    public void destory() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:47
 */
public class HorrorShow {

    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d) {
        d.menace();
        d.destory();
    }
    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DergonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }

}
