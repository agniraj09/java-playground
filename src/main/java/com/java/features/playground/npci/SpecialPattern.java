package com.java.features.playground.npci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecialPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int testcases = scan.nextInt();
        List<List<Integer>> elementsList = new ArrayList<>();

        for (int i = 1; i <= testcases; i++) {
            System.out.println("Enter number of elements for test case " + i);
            int elements = scan.nextInt();
            List<Integer> elementsListSingle = new ArrayList<>();
            for (int j = 0; j < elements; j++) {
                elementsListSingle.add(scan.nextInt());
            }
            elementsList.add(elementsListSingle);
        }
        // Complete this line
        // Complete this line

        System.out.println(elementsList.get(0));
        // Complete this line
        // Complete this line
    }
}
