package com.kezhong.thinkinjava.cpt7.sample.reusing;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 0:05
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
