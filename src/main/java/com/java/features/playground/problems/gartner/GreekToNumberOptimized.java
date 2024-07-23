package com.java.features.playground.problems.gartner;

import java.util.Map;

public class GreekToNumberOptimized {
    public static void maina(String[] args) {

        Map<Character, Integer> letterMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        String greekNumber = "MDXLVI";

        char[] greekChars = greekNumber.toCharArray();
        int sum = letterMap.get(greekChars[0]);

        for (int i = 1; i < greekChars.length; i++) {
            if (letterMap.get(greekChars[i - 1]) < letterMap.get(greekChars[i])) {
                sum += letterMap.get(greekChars[i]) - (2 * letterMap.get(greekChars[i - 1]));
            } else {
                sum += (letterMap.get(greekChars[i]));
            }
        }

        System.out.println("Value is " + sum);
    }

    public static void main(String[] args) {
        Map<Character, Integer> letterMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        String greekNumber = "MDXLVI";

        int sum = 0;
        int prevValue = 0;

        // Iterate from right to left
        for (int i = greekNumber.length() - 1; i >= 0; i--) {
            int currentValue = letterMap.get(greekNumber.charAt(i));

            // If the current value is less than the previous one, subtract it
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }

        System.out.println("Value is " + sum);
    }
}
