package com.java.features.test;

import java.util.List;

public class Sample {

    void add(int a) throws IndexOutOfBoundsException, NullPointerException {}

    public static void main(String[] args) {
        Integer a = Integer.parseInt("1000");
        Integer b = Integer.parseInt("1000");

        System.out.println(List.of(1, 2, 3).subList(0, 3));

        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for (int i = 0; i < k; i++) {
            int n = nums[0];
            int j = 0;
            for (j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[j] = n;
        }

        System.out.println(nums);

        System.out.println(a == b);
    }
}

class Child extends Sample {
    @Override
    void add(int a) throws ArrayIndexOutOfBoundsException {}
}
