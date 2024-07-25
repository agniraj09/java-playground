package com.java.features.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamFunctions {

    public static void main(String[] args) {
        randomNumbers();
        intStream();
        reduce();
        groupBy();
        iterateUtil();
        map();
        flatmap();
    }

    private static void randomNumbers() {
        log.info(
                "randomNumbers generated using Java8 {}",
                new Random().ints(1111, 9999).limit(10).boxed().collect(Collectors.toList()));
    }

    private static void intStream() {
        int[] intArray = {382, 85, 0, 48, 0, 422, 0, 8, 91, 83};
        var count = Arrays.stream(intArray).boxed().filter(x -> x > 0).count();
        log.info("Count of numbers greater than 0 -> {}", count);
    }

    private static void reduce() {
        var value = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        log.info("reduce -> value {}", value);
    }

    private static void groupBy() {
        List<String> items = List.of("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
        var group = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        log.info("Group {}", group);
    }

    private static void iterateUtil() {
        log.info(
                "Stream iterate using limit -> {}",
                Stream.iterate(5, n -> n + 1).limit(5).count());
        log.info(
                "Stream iterate using condition -> {}",
                Stream.iterate(99, n -> n < 111, n -> n + 1).count());
    }

    private static void map() {
        log.info(
                "Stream.map usage{}",
                Stream.of("Agni", "Raj", "Ashwin")
                        .map(String::toUpperCase)
                        // .peek(String::toLowerCase)
                        // .peek(name -> log.info("name {}", name.toLowerCase()))
                        .toList());
    }

    private static void flatmap() {
        List<String> lines = List.of("This is line 1", "This is line 2", "This is line 3 and 4");
        var words = lines.stream().flatMap(line -> Stream.of(line.split(" "))).toList();
        log.info("Words in list is {}", words);
        log.info("Number of words in list is {}", words.size());

        List<List<String>> multiDimList = List.of(List.of("Agni"), List.of("Raj"), List.of("Guna"));
        var result = multiDimList.stream().flatMap(Collection::stream).toList();
        log.info("Words in list is {}", result);
    }
}
