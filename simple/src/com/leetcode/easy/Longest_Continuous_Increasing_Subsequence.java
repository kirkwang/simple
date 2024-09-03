package com.leetcode.easy;
/*
https://leetcode.com/problems/longest-continuous-increasing-subsequence/
Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.

Example 2:

Input: nums = [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
increasing.

 */


import org.testng.Assert;

public class Longest_Continuous_Increasing_Subsequence {

    public static int findLengthOfLCIS(int[] nums) {
        int answer = -1;
        int anchor = 0;
        if (nums == null || nums.length == 0) return answer;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) {
                anchor = i;
            }
            answer = Math.max(answer, i - anchor + 1);
        }
        return answer;
    }


    public static void main(String[] args) {

        Assert.assertEquals(3, Longest_Continuous_Increasing_Subsequence.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        Assert.assertEquals(1, Longest_Continuous_Increasing_Subsequence.findLengthOfLCIS(new int[]{2, 2, 2, 2}));
    }
}
