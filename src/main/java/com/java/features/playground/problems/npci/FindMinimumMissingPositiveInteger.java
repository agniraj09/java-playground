package com.java.features.playground.problems.npci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

// Find minimum missing positive integer in the given list
@Slf4j
class FindMinimumMissingPositiveInteger {

    public static void main(String[] args) {
        int minimum = solution(new int[] {1, 2, 3, 4, 5});
        log.info("{}", minimum);
        minimum = solution(new int[] {-1, -2, -3});
        log.info("{}", minimum);
        minimum = solution(new int[] {0, 4, 2, 1, 9, 7});
        log.info("{}", minimum);
        minimum = solution(new int[] {0, 0});
        log.info("{}", minimum);
    }

    public static int solution(int[] A) {
        int minimumNumber = 0;
        List<Integer> input = new ArrayList<>(Arrays.stream(A)
                .boxed()
                .filter(number -> number > 0)
                .sorted(Integer::compareTo)
                .toList());
        if (input.isEmpty()) {
            minimumNumber = 1;
            return minimumNumber;
        }

        for (int i = 1; i < input.size(); i++) {
            int difference = (input.get(i) - input.get(i - 1));
            if (difference > 1) {
                minimumNumber = input.get(i - 1) + 1;
                break;
            }
        }

        if (minimumNumber == 0) {
            minimumNumber = input.get(input.size() - 1) + 1;
        }

        return minimumNumber;
    }
}
