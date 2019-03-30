/*
 * 3/24/19 5:56 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://leetcode.com/problems/array-partition-i/description/
 */
package com.kirkwang.easy;

import java.util.Arrays;

class ArrayPairSum {

    public static int min(int[] a) {
        Arrays.sort(a);
        int max_sum = 0;

        for (int i = 0; i < a.length; i++) {
            max_sum += Math.min(a[i], a[i + 1]);
            i++;
        }
        return max_sum;
    }

    public static int min_1(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            result = result + nums[i * 2];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("ArrayPairSum " + ArrayPairSum.min_1(new int[]{1, 4, 3, 2}));
    }
}