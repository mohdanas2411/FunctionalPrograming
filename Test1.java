package com.FunctionalInerface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.*;

import java.util.ArrayList;

@FunctionalInterface
interface Area {
    double circle(int pi);
    default int square(int a, int b) {
        return a * b;
    }

}
@FunctionalInterface
interface Area1 {
    double circle(int pi);

    default int square1(int a, int b) {
        return a * b;
    }

}
@FunctionalInterface
interface Area2 extends Area,Area1 {
    double circle(int pi);
}

public class Test1 {

    public static void main(String[] args) {
        Area2 cir = (int pi) -> 3.14 * pi;
        System.out.println(cir.circle(10));



       // System.out.println(Predicate.test());

    }
}
