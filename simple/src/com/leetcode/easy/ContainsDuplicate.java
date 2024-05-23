package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate/">...</a>
 * Given an integer array nums,
 * return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        int[] b = {1, 2, 3, 4};
        int[] c = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        Assert.assertTrue(containsDuplicate(a));
        Assert.assertFalse(containsDuplicate(b));
        Assert.assertTrue(containsDuplicate(c));

    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return set.size() < nums.length;
    }
}
