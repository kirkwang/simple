package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/two-sum/description/
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */
public class TwoSum {
    public static int[] function(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{2};
    }

    public static void main(String[] args) {
        int[] result = function(new int[]{3, 3}, 6);
        Assert.assertEquals(result, new int[]{0, 1});

        Assert.assertEquals(function(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        Assert.assertEquals(function(new int[]{3, 2, 4}, 6), new int[]{1, 2});

    }
}
