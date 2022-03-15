package com.FunctionalInerface;

import java.util.function.Function;

public class FunctionDemo{


    public static void main(String[] args) {
        Function<String,Integer> function = (t) ->  t.length();
        System.out.println(function.apply("uytdvbndfgdfghjkldd bsddsgsd  bdb jcjbcb"));


        Function<Integer,Integer> f = Function.identity();
        System.out.println(f.apply(1));

    }
}
