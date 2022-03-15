package com.FunctionalInerface;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2};
        String[] str = {"anas","hello",null};
        Optional<Object> opt = Optional.empty();
        System.out.println(opt);
        Optional<Integer> val = opt.of(arr[3]);
        System.out.println(val);

        System.out.println(val.isPresent());
        System.out.println(val.get());
        System.out.println(opt.ofNullable(str[2]));

        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(2,123);
        hmap.put(4,89);
        hmap.put(null,98);
        System.out.println(hmap);

        System.out.println("hello");
        hmap.entrySet().stream().forEach(s-> System.out.println(s.getKey()));
    }
}
