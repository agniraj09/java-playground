package com.java.features.playground.problems.gartner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreekToNumberSelf {
    public static void main(String[] args) {
        // I=1
        // V=5
        // X=10
        // L=50
        // C=100
        // D=500
        // M=1000

        // MDXLVI
        // 1000 + 500 + (10 - 50) + 5 + 1
        // 1500 + (-40) + 6
        // 1546
        // 1466

        // MMMCCCXLIX
        // 1000 + 1000 + 1000 + 100 + 100 + 100 + (10 - 50)  + (1 - 10)
        // 3300 + 40 + 9
        // 3349

        Map<String, Integer> letterMap = new HashMap<>();
        letterMap.put("I", 1);
        letterMap.put("V", 5);
        letterMap.put("X", 10);
        letterMap.put("L", 50);
        letterMap.put("C", 100);
        letterMap.put("D", 500);
        letterMap.put("M", 1000);

        String greekNumber = "IX";

        char[] greekChars = greekNumber.toCharArray();
        List<Integer> values = new ArrayList<>();
        values.add(letterMap.get(String.valueOf(greekChars[0])));

        for (int i = 1; i < greekChars.length; i++) {
            String currentChar = String.valueOf(greekChars[i]);
            String previousChar = String.valueOf(greekChars[i - 1]);

            if (letterMap.get(previousChar) < letterMap.get(currentChar)) {
                values.add(Math.abs(letterMap.get(currentChar) - (2 * letterMap.get(previousChar))));
            } else {
                values.add(letterMap.get(currentChar));
            }
        }

        int sum = 0;
        for (Integer value : values) {
            sum = sum + value;
        }

        System.out.println("Value is " + sum);
    }
}
