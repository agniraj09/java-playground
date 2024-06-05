package com.java.features.java11;

import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaAnnotation {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", null);
        String result = list.stream()
                .map((@NonNull var x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
