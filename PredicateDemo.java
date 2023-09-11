package com.FunctionalInerface;

import test.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo extends Test{

    public static void main(String[] args) {

        Consumer<Integer> consume = t -> System.out.println("result " + t);
//        Predicate<Integer> pre = t -> {
//            if (t % 2 == 0)
//                return true;
//            else
//                return false;
//        };
        // remove unnecessary things
        Predicate<Integer> pre = t -> t % 2 == 0;

        System.out.println(pre.test(10));
        System.out.println(pre.test(9));

        System.out.println("using list");

        List<Integer> lis = Arrays.asList(12, 43, 66, 49, 1356, 65);


        lis.stream().filter(pre).forEach(t -> System.out.println("even data " + t));

        lis.stream().filter(pre.negate()).forEach(t -> System.out.println("odd data " + t));


        //Collectors .toList() method return list
        List<Integer> all = lis.stream().filter(pre).collect(Collectors.toList());

        all.stream().forEach(t -> System.out.println("Using Collector :" + t));


        Predicate p1 = (s) -> s.equals(true);
        Predicate p2 = (s) -> {

            System.out.println(s);
            return s.equals(true);
        };

        Predicate p3 = (s) -> true;

        System.out.println(p1.and(p2).test(p3.test("jj")));


        String bet = "Soboleva Anastasiya konstantinovna";
        String team = "A Soboleva";

        List<String> betList = Stream.of(bet.split(" ")).map(String::trim).collect(Collectors.toList());
        List<String> teamList = Stream.of(team.split(" ")).map(String::trim).collect(Collectors.toList());

        betList.stream().forEach(System.out::println);
        teamList.stream().forEach(System.out::println);

        int matchCount=0;
        for(String teamSlice:betList){
            for(String betRadarTeamSlice:teamList){
                if(teamSlice.equalsIgnoreCase(betRadarTeamSlice)){
                    ++matchCount;
                }
            }
        }
        if(matchCount>=1) {
            System.out.println(" true");
        }
        System.out.println(" false");

    }
}
