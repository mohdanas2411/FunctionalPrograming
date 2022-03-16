package com.FunctionalInerface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PeekDemo {
    public static void main(String[] args) {
        Employee[] arrayOfEmp = {new Employee(10, "anas"), new Employee(20, "aa")};
        Stream<Employee> str = Arrays.stream(arrayOfEmp);
        //List<Employee> emp = str.peek(employee -> employee.updateSal(300)).peek(System.out::println).collect(Collectors.toCollection(LinkedList::new));
        List<Employee> emp = str.peek(employee -> employee.updateSal(300)).peek(System.out::println).collect(Collectors.toList());
    }
}
