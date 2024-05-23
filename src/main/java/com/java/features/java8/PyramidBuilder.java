package com.java.features.java8;

public class PyramidBuilder {
    public static void main(String[] args) {
        fullPyramid(5);
    }

    private static void fullPyramid(int rows) {
        System.out.println("\n2. Full Pyramid\n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }
}
