package com.leetcode.medium;

import org.testng.Assert;

/*
https://leetcode.com/problems/maximum-product-subarray/description/
Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

 */
@Deprecated
//wrong answer
public class MaximumProductSubarray {

    public static int MaximumProductSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int current_sum;
            for (int j = i; j < nums.length; j++) {
                current_sum = nums[i] + nums[j];
                if (current_sum > max) {
                    max = current_sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] input = new int[]{2, 3, -2, 4};
        Assert.assertEquals(MaximumProductSubarray(input), 6);


    }
}
