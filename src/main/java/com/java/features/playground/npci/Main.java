package com.java.features.playground.npci;
// Importing necessary libraries
import java.util.*;

public class Main {
    // Function to find minimum number of bribes
    public static void minimumBribes(int[] q) {
        int bribe = 0;
        for(int i = q.length - 1; i >= 0; i--) {
            if(q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for(int j = Math.max(0, q[i] - 2); j < i; j++)
                if(q[j] > q[i]) bribe++;
        }
        System.out.println(bribe);
    }

    // Main function
    public static void main(String[] args) {
        // Test case 1
        int[] q1 = {5, 1, 2, 3, 7, 8, 6, 4};
        minimumBribes(q1);

        // Test case 2
        int[] q2 = {1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(q2);
    }
}
