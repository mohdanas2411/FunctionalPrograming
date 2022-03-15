package com.FunctionalInerface;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    public static void main(String[] args) {
        BinaryOperator b = (Object t,Object s) -> t;
        System.out.println(b.apply(20,43));


    }
}
