package com.java.features.java11;

import java.util.List;
import java.util.stream.Collectors;
import lombok.NonNull;

public class LambdaAnnotation {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        String result = list.stream().map((@NonNull var x) -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(result);
    }
}
