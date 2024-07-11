package com.java.features.playground.problems.x;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubString {

    public static void main(String[] args) {
        String word = "abcadabcdefaabb";

        int startIndex = 0, endIndex = 0, maxLength = 0;
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < word.length(); j++) {
                if (word.substring(i, j).contains(String.valueOf(word.charAt(j)))) {
                    break;
                } else {
                    count++;
                }
                if (count > maxLength) {
                    startIndex = i;
                    endIndex = j + 1;
                    maxLength = j + 1 ;
                }
            }
        }

        System.out.printf("Max unique substring %s", word.substring(startIndex, endIndex));
    }

    public static void mainGen(String[] args) {
        String word = "abcdabcdefaabb";

        Map<Character, Integer> visited = new HashMap<>();
        int output_start = 0, output_end = 0;
        int start = 0;

        for(int end = 0; end < word.length(); end++) {
            char currChar = word.charAt(end);

            if(visited.containsKey(currChar)) {
                start = Math.max(start, visited.get(currChar) + 1);
            }

            if(output_end - output_start < end - start) {
                output_start = start;
                output_end = end;
            }

            visited.put(word.charAt(end), end);
        }

        System.out.printf("Max unique substring %s", word.substring(output_start, output_end + 1));
    }

}
