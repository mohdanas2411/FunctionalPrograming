package com.FunctionalInerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperations {
    public static void main(String[] args) {

        // map
        List<Integer> num = Arrays.asList(1, 2, 5, 3, 88, 6);
        List<Integer> square = num.stream().map(val -> val * val).collect(Collectors.toList());
        square.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();



        //flatMap

        List<Integer> num1 = Arrays.asList(2, 2, 5, 3, 88, 6,6);
        List<Integer> num2 = Arrays.asList(10, 20, 50, 30, 808, 60);
        ArrayList<List> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);

//        System.out.println(num1);
//        System.out.println("distinct ");
//        num1.stream().distinct().forEach(s-> System.out.print(s+" "));


        System.out.println("list 1 "+ num1);
        System.out.println("list 2 "+ num2);
        List collect = (List) list.stream().flatMap(list1 -> list1.stream()).collect(Collectors.toList());
        System.out.println(collect);

        //sort list which merger using flatMap
        System.out.println("Sorted List");
        collect.stream().sorted().forEach(s-> System.out.print(s+" "));
        System.out.println();


        //filter
        List<String> name = Arrays.asList("Anas", "aa", "Abc", "aaaaak", "A");
        List<String> startWith_A = name.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        startWith_A.forEach(p -> System.out.print(p + " "));
        System.out.println();

        //sorted
        List<String> names = Arrays.asList("hello", "Bye", "cUTE", "Anas");
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        sortedNames.stream().forEach(print -> System.out.print(print + " "));

        //min method take comparator return Optional
        System.out.println("\nMin string "+name.stream().min((i1,i2)->i1.compareTo(i2)).get());

    }
}
