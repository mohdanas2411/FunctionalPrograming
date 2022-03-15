package com.FunctionalInerface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalOperations {
    public static void main(String[] args) {

// collect
        List<Integer> num = Arrays.asList(1, 2, 5, 3, 88, 6);
        List<Integer> square = num.stream().map(val -> val * val).collect(Collectors.toList());
        square.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();



        //forEach
        List<String> name = Arrays.asList("Anas", "aa", "Abc", "aaaaak", "A");
        name.forEach(p -> System.out.print(p + " "));
        System.out.println();

        //reduce
        List<String> names = Arrays.asList("hello", "Bye", "cUTE", "Anas");
        String concat = names.stream().filter(st -> st.contains("e")).reduce("value : ",(var,a) -> var.concat(a));
        System.out.println(concat);


    }
}
