package com.java.features.playground.problems.leetcode;

public class RemoveElementsFromArrayAndMoveOtherElementsToLeft {
    public static void main(String[] args) {
        removeElement(new int[] {3, 2, 2, 3}, 3);
    }

    public static int removeElement1(int[] nums, int val) {
        int[] cleanedUpNums = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                cleanedUpNums[j] = nums[i];
                j++;
            }
        }
        System.arraycopy(cleanedUpNums, 0, nums, 0, cleanedUpNums.length);
        return j;
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
