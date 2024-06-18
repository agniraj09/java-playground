package com.java.features.playground.problems.raja;

import java.util.HashSet;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintDuplicateChars {

    public static void main(String[] args) {
        String s = "28 td tda 54242ljdnd";

        Set<Character> duplicates = new HashSet<>();
        Set<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        log.info("Duplicate characters {}", duplicates);
    }
}
