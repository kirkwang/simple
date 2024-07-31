package com.leetcode.easy;
/*
https://leetcode.com/problems/running-sum-of-1d-array/description/
Example 1:
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]
        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]
*/

import org.testng.Assert;

public class RunningSum {

    public static int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Assert.assertEquals(runningSum(new int[]{3, 1, 2, 10, 1}), new int[]{3, 4, 6, 16, 17});
        Assert.assertEquals(runningSum(new int[]{1, 1, 1, 1, 1}), new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(runningSum(new int[]{1, 2, 3, 4}), new int[]{1, 3, 6, 10});
    }
}
