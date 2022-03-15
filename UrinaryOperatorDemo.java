package com.FunctionalInerface;

import java.util.function.UnaryOperator;

public class UrinaryOperatorDemo implements UnaryOperator {


    @Override
    public Object apply(Object o) {
        return null;
    }

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (t) -> 10+t;

        System.out.println(unaryOperator.apply(11));

        UnaryOperator<Integer> f =UnaryOperator.identity();
        System.out.println(f.apply(10));
    }
}
