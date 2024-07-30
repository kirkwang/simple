package com.leetcode.medium;

import org.testng.Assert;

/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[nums.length - 1 - i] == target) {
                result[1] = nums.length - 1 - i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {


        int[] result = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        Assert.assertSame(result[0], 3);
        Assert.assertSame(result[1], 4);
    }
}
