package com.java.features.playground.problems.whatsapp;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SplitSentenceAndFind2ndMaxCountWord {

    public static void main(String[] args) {
        String s = "This is a repeating sentence is a sentence repeating itself is the one who caught the one";

        var map =
                Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long sec = map.values().stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        var k = map.entrySet().stream()
                .filter(e -> sec == e.getValue())
                .findFirst()
                .get()
                .getKey();

        System.out.println(k + "-" + sec);
    }
}
