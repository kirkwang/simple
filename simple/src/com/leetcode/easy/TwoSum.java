package com.leetcode.easy;

import org.testng.Assert;

import java.util.Arrays;

/**
 * Created by kewang on 12/22/17.
 * <p>
 * <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific
 * target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3, 2, 4}, 6);

        System.out.print(result[0] + " " + result[1]);
        Assert.assertEquals(Arrays.stream(result).toArray()[0], "[]");
    }


    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }
}
