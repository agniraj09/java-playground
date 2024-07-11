package com.java.features.playground.problems.leetcode;

public class Jump2 {
    public int jump(int[] nums) {
        // Initialize variables
        int jumps = 0, curEnd = 0, curFarthest = 0;
        
        // Iterate over the array
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest we can reach
            curFarthest = Math.max(curFarthest, i + nums[i]);
            
            // If we've reached the end of the current jump
            if (i == curEnd) {
                // Increment the number of jumps
                jumps++;
                // Update the end of the current jump
                curEnd = curFarthest;
            }
        }
        
        // Return the minimum number of jumps
        return jumps;
    }
}