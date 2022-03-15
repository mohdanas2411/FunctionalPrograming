package com.FunctionalInerface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo extends Test1{
    static int a;
    public static void main(String[] args) {
        int b = 10;

        int finalB = b;
        Consumer<Integer> consume = (t) -> {
           System.out.println(finalB);
            System.out.println("print value in consumer's accept "+t);
        };
b = 100;
        // and only one argument is passed then  parenthesis are not required
//        Consumer<Integer> consume = t -> System.out.println("print value in consumer's accept "+t);
       // if there is only one line in our consume methods then curly brackets are not required.


       consume.accept(10);

        List<Integer> li = Arrays.asList(14,43,33,23,27);

        li.stream().forEach(consume);
        // here as we know that forEach takes a Consumer as argument then we directly passed our operations rather than reference of our Functional Interface.
        li.stream().forEach(consume);
        li.stream().forEach(t -> System.out.println("Directly passed our operations rather than reference of our Functional Interface "+t));


        // andThen method of Consumer
        Consumer<String> consume1 = t -> System.out.println("Hii "+t);
        Consumer<String> consume2 = t -> System.out.println("Bye "+t);
        Consumer<String> consume3 = t -> System.out.println("Good Bye "+t);

        consume1.andThen(consume2).accept("Anas");

        consume1.andThen(consume2).andThen(consume3).accept("Ansari");

    }
}
