package com.leetcode;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    Example 1:

    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
    Example 2:

    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]
*/

public class ProductOfArrayExceptSelf {

    public static int[] ProductOfArrayExceptSelf(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];
        int[] left = new int[N];
        int[] right = new int[N];
        left[0] = 1;
        right[N - 1] = 1;
//  1,2,3,4
//  1,1,2,6
        for (int i = 1; i < N; i++) {
            left[i] = nums[i - 1] * left[i - 1];

        }
        // 1,2,3,4
        // 24,12,4, 1
        for (int i = N - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];

        }

        for (int i = 0; i < N; i++) {
            result[i] = left[i] * right[i];

        }

        return result;
    }

    public static void main(java.lang.String args[]) {

        int[] input = new int[]{1, 2, 3, 4};
        for (int i : ProductOfArrayExceptSelf(input)) {
            System.out.println(i);
        }
    }
}
