package com.java.features.playground.problems.gen;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReplacementMostRepeatingWithLeastRepeating {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.nextLine();

        // Step 1 - Group the characters based on count in descending order
        var groupedChars = Stream.of(word.toUpperCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                // .collect(Collectors.groupingBy( Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey,
                // Collectors.toList())))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> (int) (e2.getKey() - e1.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        // Step 2 - Find most repeating character, first character in alphabetical order
        String most = groupedChars.entrySet().stream().limit(1).findFirst().get().getValue().stream()
                .min(Comparator.naturalOrder())
                .get();

        // Step 3 -  Find least repeating character, last character in alphabetical order
        String least =
                groupedChars.entrySet().stream().skip(groupedChars.size() - 1).findFirst().get().getValue().stream()
                        .max(Comparator.naturalOrder())
                        .get();

        word = word.replace(most, least).replace(most.toLowerCase(), least);

        System.out.println(word);
    }
}
