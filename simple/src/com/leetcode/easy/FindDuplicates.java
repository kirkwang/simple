package com.leetcode.easy;
/*
  https://leetcode.com/problems/find-all-duplicates-in-an-array/
  Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
  Example 1:
  <p>
  Input: nums = [4,3,2,7,8,2,3,1]
  Output: [2,3]
  Example 2:
  <p>
  Input: nums = [1,1,2]
  Output: [1]
  Example 3:
  <p>
  Input: nums = [1]
  Output: []
 */

import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                list.add(i);
            } else {
                set.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        Assert.assertEquals(findDuplicates(input).toString(), "[2, 3]");

        input = new int[]{1, 1, 2};
        Assert.assertEquals(findDuplicates(input).toString(), "[1]");

        input = new int[]{1};
        Assert.assertEquals(findDuplicates(input).toString(), "[]");

    }
}
