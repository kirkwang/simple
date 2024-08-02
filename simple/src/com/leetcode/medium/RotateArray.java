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


        array = new int[]{-1, -100, 3, 99};
        RotateArray.routeLeft(array, 2);
        Assert.assertEquals(array, new int[]{3, 99, -1, -100});

        array = new int[]{-1, -100, 3, 99, 0};
        RotateArray.rotate(array, 2);
        Assert.assertEquals(array, new int[]{99, 0, -1, -100, 3});


    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
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

    public static void routeLeft(int[] input, int count) {
        if (count > input.length) {
            count = count % input.length;
        }
        for (int i = 0; i < count; i++) {
            routeLeftByOne(input, input.length);
        }
    }

    private static void routeLeftByOne(int[] array, int length) {
        //[1,2,3,4,5,6,7]
        //[2,3,4,5,6,7,1]
        int temp = array[0];
        for (int i = 0; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[length - 1] = temp;

    }

    public static void routeRight(int[] nums, int k) {
        if (k > nums.length) {
            k %= nums.length;
        }
        for (int i = 0; i < k; i++) {
            routeRightByOne(nums, nums.length);
        }
    }

    private static void routeRightByOne(int[] array, int length) {
        length--;
        int temp = array[length];
        for (int i = 0; i < length; i++) {
            array[length - i] = array[length - i - 1];
        }
        array[0] = temp;

    }

}
