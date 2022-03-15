package com.FunctionalInerface;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MinByandMaxBy{

    @Override
    public String toString() {
        return "MinByandMaxBy{}";
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(348, 44, 22, 422, 30, 28, 398, 4,666);
        Optional<Integer> minBy1 = integers.stream().collect(Collectors.minBy((i1, i2) -> i1 - i2));
        System.out.println("Using minBy "+minBy1);


        Integer min = integers.stream().min((i1, i2) -> i1 - i2).get();
        System.out.println("Using min "+min);

    }
}
