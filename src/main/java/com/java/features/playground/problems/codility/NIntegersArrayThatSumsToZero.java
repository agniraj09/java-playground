package com.java.features.playground.problems.codility;

import java.util.Arrays;

public class NIntegersArrayThatSumsToZero {
    public static void main(String[] args) {
        int[] numbers = solution(5);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] solution(int N) {

        int[] numbers = new int[N];
        int count = 1;
        if (N % 2 != 0) {
            numbers[0] = 0;
            for (int i = 1; i <= (N - 1) / 2; i++) {
                numbers[i] = count++;
            }
            count = -1;
            for (int i = (N / 2) + 1; i < N; i++) {
                numbers[i] = count--;
            }
        } else {
            for (int i = 0; i < N / 2; i++) {
                numbers[i] = count++;
            }
            count = -1;
            for (int i = (N / 2); i < N; i++) {
                numbers[i] = count--;
            }
        }
        return numbers;
    }
}
