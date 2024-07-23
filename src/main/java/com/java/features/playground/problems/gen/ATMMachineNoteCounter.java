package com.java.features.playground.problems.gen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMMachineNoteCounter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount");

        int amount = scan.nextInt();

        Map<Integer, Integer> noteCount = new LinkedHashMap<>();
        amount = countNotes(amount, 1000, noteCount);
        amount = countNotes(amount, 500, noteCount);
        amount = countNotes(amount, 200, noteCount);
        amount = countNotes(amount, 100, noteCount);
        amount = countNotes(amount, 50, noteCount);
        amount = countNotes(amount, 20, noteCount);
        countNotes(amount, 10, noteCount);
        System.out.println(noteCount);
    }

    private static int countNotes(int amount, int currencyValue, Map<Integer, Integer> noteCount) {
        noteCount.put(currencyValue, amount / currencyValue);
        return amount % currencyValue;
    }
}
