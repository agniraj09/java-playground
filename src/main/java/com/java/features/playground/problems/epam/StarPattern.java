package com.java.features.playground.problems.epam;

public class StarPattern {

    /*    Print this pattern. Input -> numbers of stars at the center.
     *       *
     *      ***
     *     ***** -> Length
     *      ***
     *       *
     * */

    public static void main(String[] args) {
        int maxStars = 11;

        int n = (maxStars % 2 == 0) ? maxStars / 2 : (maxStars / 2) + 1;

        int c = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxStars; j++) {
                if (j >= (n - c) && j <= (n + c)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            c++;
            System.out.println();
        }

        c = n - 2;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= maxStars; j++) {
                if (j >= (n - c) && j <= (n + c)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            c--;
            System.out.println();
        }
    }
}
