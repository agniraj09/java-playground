package com.java.features.java8;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class CollectionUtils {

    public static void main(String[] args) {
        listToMap();
    }

    /**
     * List to Map conversion using Java Streams API
     */
    private static void listToMap() {
        List<String> captains = List.of(
                "Dhoni", "Dhoni", "Dhoni", "Dhoni", "Dhoni",
                "Rohit", "Rohit", "Rohit", "Rohit",
                "Kohli", "Kohli", "Kohli",
                "Shreyas", "Shreyas");

        // List to Map
        var map = captains.stream()
                .collect(Collectors.toMap(key -> key, value -> value, (oldV, newV) -> oldV));
        log.info("List converted to Map -> {}", map);

        // List to Grouped Map with Key-Count
        var groupedMap = captains.stream()
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        log.info("List grouped to Map -> {}", groupedMap);

    }
}
