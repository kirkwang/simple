package com.leetcode.easy;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

 */
public class FindDisappearedNumbers {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        result.add(5);
        result.add(6);
        Assert.assertEquals(findDisappearedNumbers(nums), result);

        nums = new int[]{1, 1};
        result.clear();
        result.add(2);
        Assert.assertEquals(findDisappearedNumbers(nums), result);


    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] b = new boolean[nums.length];
        List<Integer> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }
        for (int i : nums) {
            b[i - 1] = true;
        }
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
