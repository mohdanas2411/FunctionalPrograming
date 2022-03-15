package com.FunctionalInerface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{


    public static void main(String[] args) {
        Supplier<String> supply = () -> "hii i am anas";
        System.out.println(supply.get());


        List<String> value = Arrays.asList("1","2","3","4","5");



        //return length of list
        System.out.println(value.stream().parallel().count());

        System.out.println(value.stream().findAny().orElseGet(() -> "find nothing"));

        //return first element in list
        System.out.println(value.stream().findFirst().get());

        //return localdate and time
        Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();
        System.out.println(localDateTimeSupplier.get());

        Supplier<LocalDate> localDateSupplier = () -> LocalDate.now();
        System.out.println(localDateSupplier.get());
        System.out.println(localDateSupplier);

    }
}
