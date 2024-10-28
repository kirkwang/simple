package com.leetcode.easy;

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

import org.testng.Assert;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productOfArrayExceptSelf(int[] nums) {
        int L = nums.length;
        int[] result = new int[L];
        int[] left = new int[L];
        int[] right = new int[L];
        left[0] = 1;
        right[L - 1] = 1;
//  1,2,3,4
//  1,1,2,6
        for (int i = 1; i < L; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        // 1,2,3,4
        // 24,12,4, 1
        for (int i = L - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];

        }

        for (int i = 0; i < L; i++) {
            result[i] = left[i] * right[i];

        }
        return result;
    }

    public static void main(String... args) {

        int[] input = new int[]{1, 2, 3, 4};

        Assert.assertTrue(Arrays.equals(productOfArrayExceptSelf(input), new int[]{24, 12, 8, 6}));
    }
}
