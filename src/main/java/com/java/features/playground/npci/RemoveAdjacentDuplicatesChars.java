package com.java.features.playground.npci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RemoveAdjacentDuplicatesChars {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of words");
        int elements = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter words one by one in next line");
        IntStream.range(0, elements).forEach(iteration -> words.add(scan.nextLine()));


        List<Integer> substitutions = replaceAdjacentDuplicateChars(words);
        System.out.println(substitutions);
    }

    private static List<Integer> replaceAdjacentDuplicateChars(List<String> words) {
        List<Integer> substitutions = new ArrayList<>();
        List<String> subWords = new ArrayList<>();

        for (String word : words) {
            int subs = 0;
            boolean containsDuplicates = true;

            do {
                for (int i = 1; i < word.length(); i++) {
                    if (word.charAt(i) == word.charAt(i - 1)) {
                        word = word.substring(0, i - 1) + word.substring(i);
                        subs++;
                        containsDuplicates = true;
                        --i;
                    } else {
                        containsDuplicates = false;
                    }
                }
            } while (!containsDuplicates);
            substitutions.add(subs);
            subWords.add(word);
        }
        System.out.println(subWords);
        return substitutions;
    }
}
