package com.codegym;

import java.lang.invoke.MutableCallSite;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new MoveblePoint(3.4f, 5.6f,4,5);
        System.out.println(point);

        Point p2 = ((MoveblePoint) point).move();
        System.out.println(p2);

    }
}
