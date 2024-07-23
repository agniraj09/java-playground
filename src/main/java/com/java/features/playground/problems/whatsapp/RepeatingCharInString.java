package com.java.features.playground.problems.whatsapp;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingCharInString {

    public static void main(String[] args) {
        String word = "aaabbbcccddeeefffggg";

        Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> (int) (e2.getKey() - e1.getKey()))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
