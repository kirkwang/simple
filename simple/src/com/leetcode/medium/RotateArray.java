package com.leetcode.medium;

import org.testng.Assert;

/**
 * Created by kewang on 12/25/15.
 */
/*
https://leetcode.com/problems/rotate-array/description/
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

*/
@SuppressWarnings("Array")
public class RotateArray {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        RotateArray.routeLeft(array, 2);
        Assert.assertEquals(array, new int[]{3, 4, 5, 6, 1, 2});

        //put it back by shift to the right
        RotateArray.routeRight(array, 2);
        Assert.assertEquals(array, new int[]{1, 2, 3, 4, 5, 6});


        array = new int[]{-1, -100, 3, 99, 0};
        RotateArray.rotate2R_sysCopy(array, 2);
        Assert.assertEquals(array, new int[]{99, 0, -1, -100, 3});


    }

    public static void rotate2R_sysCopy(int[] nums, int k) {
        //cut down cycles
        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] results = new int[nums.length];
        for (int i = 0; i < k; i++) {
            results[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            results[i] = nums[j];
            j++;
        }
        System.arraycopy(results, 0, nums, 0, nums.length);
    }

    public static void routeLeft(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        for (int i = 0; i < k; i++) {
            routeLeftByOne(nums, nums.length);
        }
    }

    public static void routeRight(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        for (int i = 0; i < k; i++) {
            routeRightByOne(nums, nums.length);
        }
    }

    private static void routeLeftByOne(int[] nums, int k) {
        //[1,2,3,4,5,6,7]
        //[2,3,4,5,6,7,1]
        k--;
        int temp = nums[0];
        for (int i = 0; i < k; i++) {
            nums[i] = nums[i + 1];
        }
        nums[k] = temp;

    }

    private static void routeRightByOne(int[] nums, int k) {
        k--;
        int temp = nums[k];
        for (int i = 0; i < k; i++) {
            nums[k - i] = nums[k - i - 1];
        }
        nums[0] = temp;

    }

}
