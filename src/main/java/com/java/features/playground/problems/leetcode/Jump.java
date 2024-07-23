package com.java.features.playground.problems.leetcode;

// Java code to solve the problem
class Jump {

    public static void main(String[] args) {
        canJump(new int[] {5, 4, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0});
    }

    public static boolean canJump(int[] nums) {
        // Initialize the maximum reachable index
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            // If the current index is greater than the maximum reachable index, return false
            if (i > maxReach) return false;
            // Update the maximum reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        // If the loop completes, it means we can reach the last index
        return true;
    }
}
