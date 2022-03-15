package com.FunctionalInerface;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
        //initial value 0 of sum and contain sum of all values from list
        Integer reduce1 = list.stream().reduce(0, (sum, val) -> sum + val);
        System.out.println("reduce 1 initial value 0 "+reduce1);

        //initial value 10 of sum and contain sum of all values from list
        Integer reduce2 = list.stream().reduce(10, (sum, val) -> sum + val);
        System.out.println("reduce 2 initial value 10 "+reduce2);

        //approach 2

        //initial value 10 of sum and contain sum of all values from list
        //and provide method reference
        Integer reduce3 = list.stream().reduce(10, Integer::sum);
        System.out.println("reduce 3 initial value 10 "+reduce3);

       // using parallel stream
        Integer reduce4 = list.stream().parallel().reduce(10,(ex,ne)->ex+ne, Integer::sum);
        System.out.println("reduce 4 initial value 10 "+reduce4);







    }
}
