package com.kezhong.thinkinjava.cpt7.sample.reusing;

import static com.kezhong.thinkinjava.lib.Print.println;

class Shape{
    Shape(int i) {
        println("Shape Constructor");
    }

    void dispose() {
        println("Shape dispose");
    }
}

class Circle extends Shape {

    Circle(int i) {
        super(i);
        println("Drawing Circle");
    }

    @Override
    void dispose() {
        println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        println("Drawing Triangle");
    }

    @Override
    void dispose() {
        println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        println("Drawing Line: " + start + ", " + end);
    }

    @Override
    void dispose() {
        println("Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}

public class CADSystem extends Shape{

    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];


    CADSystem(int i) {
        super(i);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j , j * j);
        }
        c = new Circle(i);
        t = new Triangle(i);
        println("Combined Constructor");
    }

    @Override
    void dispose() {
        println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {

        } finally {
            x.dispose();
        }
    }

}
