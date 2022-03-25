package com.FunctionalInerface;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsClassDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(348, 44, 22, 422, 30, 28, 398, 4);

        //summing all values of list
        // Integer sum = list.stream().collect(Collectors.summingInt(val -> val));
        System.out.println("\n\nusing Collectors.summingInt \n");

        Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Summing Int " + sum);


        Double average = list.stream().collect(Collectors.averagingInt(val -> val));
        System.out.println("Averaging Int " + average);


        ArrayList<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(432, "Anas"));
        emplist.add(new Employee(232, "paul"));
        emplist.add(new Employee(732, "john"));
        emplist.add(new Employee(532, "bill"));
        emplist.add(new Employee(132, "abc"));


        // joining
        //you can paas any charSequence in joining fuction
        System.out.println("\n\nusing Collectors.joining \n");

        String s = emplist.stream().map(Employee::getName).collect(Collectors.joining(" , "));
        System.out.println("joining with 1 parameter  :  " + s);

        //joining overloaded
        //you can paas any charSequence in joining fuction
        String s1 = emplist.stream().map(Employee::getName).collect(Collectors.joining(" mid ", " start ", " end "));
        System.out.println("joining overloaded with 3 parameter  :  " + s1);

        //joining overloaded
        //you can paas any charSequence in joining fuction
        String s2 = emplist.stream().map(Employee::getName).collect(Collectors.joining());
        System.out.println("joining overloaded with 0 parameter :  " + s2);


        //Collectors.summingDouble
        System.out.println("\n\nusing Collectors.summingDouble \n");

        Double sumOfSalary = emplist.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Sum of all employees salary  :  " + sumOfSalary);

        //summarizingDouble
        DoubleSummaryStatistics doubleSummaryStatistics = emplist.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        // methods of DoubleSummaryStatistics Class
        System.out.println("\n\nusing DoubleSummaryStatistics Class\n");

        System.out.println("Sum of all employees salary  :  " + doubleSummaryStatistics.getSum());
        System.out.println("Average of all employees salary  :  " + doubleSummaryStatistics.getAverage());
        System.out.println("Count of employees  :  " + doubleSummaryStatistics.getCount());
        System.out.println("Max employee salary  :  " + doubleSummaryStatistics.getMax());
        System.out.println("Min employee salary  :  " + doubleSummaryStatistics.getMin());

        //PartitionsBy take 1 argument as predicate
        System.out.println("\n\nusing Collectors.PartitionsBy \n");
        List<Integer> elements = Arrays.asList(10, 2, 3, 55, 123, 99, 98);
        Map<Boolean, List<Integer>> isEven = elements.stream().collect(Collectors.partitioningBy(val -> val % 2 == 0));
        System.out.println("Even Value List  : " + isEven.get(true));
        System.out.println("Odd Value List  : " + isEven.get(false));


        //overloaded PartitionsBy take 2 argument as predicate and Collectors.<any method of collectors class>
        Map<Boolean, Long> count = elements.stream().collect(Collectors.partitioningBy(val -> val % 2 == 0, Collectors.counting()));
        System.out.println("Number of even elements in the list : " + count.get(true));
        System.out.println("Number of odd elements in the list : " + count.get(false));


        //groupingBy take 1 argument as Function and the value that returned by this function become the key of our map.
        System.out.println("\n\nusing Collectors.groupingBy \n");
        Map<String, List<Employee>> group1 = emplist.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println("group1  groupingBy with 1 parameter  : " + group1);

        //groupingBy take 2 argument as Function and the value that returned by this function become the key of our map.
        Map<String, Set<Employee>> group2 = emplist.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.toSet()));
        System.out.println("group2  groupingBy with 2 parameter  : " + group2);

        //groupingBy take 3 argument as Function and the value that returned by this function become the key of our map , supplier only Map type , collectors
        LinkedHashMap<String, Set<Employee>> group3 = emplist.stream().collect(Collectors.groupingBy(Employee::getName, LinkedHashMap::new, Collectors.toSet()));
        System.out.println("group3  groupingBy with 3 parameter  : " + group3);

        LinkedHashMap<String, Map<String, Double>> group4 = emplist.stream().collect(Collectors.groupingBy(Employee::getName, LinkedHashMap::new, Collectors.toMap(Employee::getName, Employee::getSalary)));
        System.out.println("group3  groupingBy with 3 parameter Map inside a Map  : " + group4);


        // methods of Colloctors.reducing Class
        System.out.println("\n\nusing Colloctors.reducing Class\n");
        Double result = emplist.stream().collect(Collectors.reducing(0.0, employee -> employee.getSalary() * 10, (exix, newVal) -> exix + newVal));
        System.out.println("reduce the employees salary and return the sum multiplied by 10  :  " + result);
    }
}
