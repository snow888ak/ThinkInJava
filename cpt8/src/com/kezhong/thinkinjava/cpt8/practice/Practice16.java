package com.kezhong.thinkinjava.cpt8.practice;

import javafx.scene.control.Alert;

import static com.kezhong.thinkinjava.lib.Print.println;

class AlertStatus {
    public void alarm() {}
}

class FirstAlert extends AlertStatus {
    @Override
    public void alarm() {
        println("一级警戒");
    }
}
class SecondAlert extends AlertStatus {
    @Override
    public void alarm() {
        println("二级警戒");
    }
}
class ThirdAlert extends AlertStatus {
    @Override
    public void alarm() {
        println("三级警戒");
    }
}

class Starship {
    private AlertStatus alertStatus = new ThirdAlert();

    public void setAlertLevel(int level) {
        switch (level) {
            default:
            case 1:
                alertStatus = new FirstAlert();
                return;
            case 2:
                alertStatus = new SecondAlert();
                return;
            case 3:
                alertStatus = new ThirdAlert();
                return;
        }
    }

    public void alarm() {
        alertStatus.alarm();
    }

}

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 22:51
 */
public class Practice16 {

    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.alarm();
        ship.setAlertLevel(2);
        ship.alarm();
        ship.setAlertLevel(3);
        ship.alarm();
        ship.setAlertLevel(1);
        ship.alarm();
    }

}
