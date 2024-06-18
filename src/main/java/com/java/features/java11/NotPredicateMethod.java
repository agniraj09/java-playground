package com.java.features.java11;

import java.util.function.Predicate;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotPredicateMethod {

    public static void main(String[] args) {

        log.info(
                "Predicate.not to filter blank values {}",
                Stream.of("A", "B", "C", " ", "F").filter(Predicate.not(String::isBlank)).toList());

        log.info(
                "Predicate.not to filter negative values {}",
                Stream.of(-1, -2, 3, -4, 5, -6, 7)
                        .filter(Predicate.not(value -> value < 0))
                        .toList());
    }
}
