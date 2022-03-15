package com.FunctionalInerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsClassDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(348, 44, 22, 422, 30, 28, 398, 4);

        //summing all values of list
        Integer sum = list.stream().collect(Collectors.summingInt(val -> val));
        System.out.println("Summing Int " + sum);


        Double average = list.stream().collect(Collectors.averagingInt(val -> val));
        System.out.println("Averaging Int " + average);





    }
}
