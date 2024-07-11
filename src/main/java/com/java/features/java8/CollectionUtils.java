package com.java.features.java8;

import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollectionUtils {

    public static void main(String[] args) {
        listToMap();
    }

    /** List to Map conversion using Java8 Streams API */
    private static void listToMap() {
        List<String> captains = List.of(
                "Dhoni", "Dhoni", "Dhoni", "Dhoni", "Dhoni", "Rohit", "Rohit", "Rohit", "Rohit", "Kohli", "Kohli",
                "Kohli", "Shreyas", "Shreyas");

        // List to Map
        var map = captains.stream().collect(Collectors.toMap(k -> k, v -> v, (oldV, newV) -> oldV));
        log.info("List converted to Map -> {}", map);

        // List to Grouped Map with Key-Count
        var groupedMap = captains.stream().collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        log.info("List grouped to Map -> {}", groupedMap);
    }
}
