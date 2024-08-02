package com.leetcode.easy;

import org.testng.Assert;

/**
 * Created by kewang on 12/22/17.
 * <p>
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">...</a>
 * <p>
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution and you may not use the same
 * element twice.
 * <p>
 * Example 1:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * Example 2:
 * <p>
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 * Example 3:
 * <p>
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 *
 */

public class TwoSum_II {


    public static int[] function(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{++i, ++j};
                }
            }
        }
        return new int[]{2};
    }


    public static void main(String[] args) {

        Assert.assertEquals(function(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});
        Assert.assertEquals(function(new int[]{2, 3, 4}, 6), new int[]{1, 3});
        Assert.assertEquals(function(new int[]{-1, 0}, -1), new int[]{1, 2});
    }
}
