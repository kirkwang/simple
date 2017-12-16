package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 12/15/17.
 *
 *
 * https://leetcode.com/problems/subsets/description/
 *
 *
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * For example, If nums = [1,2,3], a solution is:
 *
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 */
public class Subsets_I {

  public static void main(String[] args) {
    List result = subsets(new int[]{1, 2, 3});
    System.out.println("This is the result " + result);
  }

  // public static int subsets(int input) {
  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    if (nums == null) {
      return list;
    }

    Arrays.sort(nums);
    generateSubSet(list, new ArrayList<Integer>(), nums, 0);

    return list;
  }

  private static void generateSubSet(List<List<Integer>> list, List objects,
      int[] nums, int j) {
    list.add(new ArrayList<>(objects));

    for (int i = j; i < nums.length; i++) {
      objects.add(nums[i]);
      generateSubSet(list, objects, nums, i + 1);
      objects.remove(objects.size() - 1);
    }
  }
}
