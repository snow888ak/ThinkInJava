package com.kezhong.thinkinjava.cpt8.polymorphism;

import static com.kezhong.thinkinjava.lib.Print.println;

class Actor {
    public void act() { }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        if (actor instanceof HappyActor) {
            actor = new SadActor();
        } else {
            actor = new HappyActor();
        }
    }
    public void performPlay() {actor.act();}
}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:45
 */
public class Transmogrify {

    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }

}
