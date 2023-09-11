package com.FunctionalInerface;

import java.util.function.Function;

public class FunctionDemo{


    public static void main(String[] args) {
        Function<String,Integer> function = (t) ->  t.length();
        System.out.println(function.apply("uytdvbndfgdfghjkldd bsddsgsd  bdb jcjbcb"));


        Function<Integer,Integer> f = Function.identity();
        System.out.println(f.apply(1));


        System.out.println("custom");

        MyFunctionalInterface<Integer,String,Integer> myfun = (a,b,c,d) -> a+b+c+d;

        System.out.println(myfun.test(1,"hello",3,4));

    }
}
