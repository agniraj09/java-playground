package com.java.features.playground.problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArraysAndSort {

    String problemStatement =
            """
            You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

            Merge nums1 and nums2 into a single array sorted in non-decreasing order.

            The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

            \s

            Example 1:

            Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
            Output: [1,2,2,3,5,6]
            Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
            The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
            Example 2:

            Input: nums1 = [1], m = 1, nums2 = [], n = 0
            Output: [1]
            Explanation: The arrays we are merging are [1] and [].
            The result of the merge is [1].
            """;

    public static void main(String[] args) {
        solution2(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3);
    }

    public static void solution1(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> merged = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            merged.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            merged.add(nums2[i]);
        }

        Collections.sort(merged);
        int j = 0;
        for (int i : merged) {
            nums1[j] = i;
            j++;
        }
    }

    public static void solution2(int[] nums1, int m, int[] nums2, int n) {
        int[] mer = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            if (i < m) mer[i] = nums1[i];

            if (i < n) mer[(m + n) - (i + 1)] = nums2[i];
        }

        Arrays.sort(mer);
        System.arraycopy(mer, 0, nums1, 0, m + n);
        System.out.println(Arrays.toString(nums1));
    }
}
