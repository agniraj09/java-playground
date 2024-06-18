package com.java.features.playground.problems.raja;

import java.util.HashSet;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintDuplicateChars {

    public static void main(String[] args) {
        String s = "28 td tda 54242ljdnd";

        Set<Character> duplicates = new HashSet<>();
        int i = 0;
        do {
            int firstindex = s.indexOf(s.charAt(i));
            int lastindex = s.lastIndexOf(s.charAt(i));
            if (firstindex != lastindex) {
                duplicates.add(s.charAt(i));
            }
            ++i;
        } while (i < s.length());

        log.info("Duplicate characters {}", duplicates);
    }
}