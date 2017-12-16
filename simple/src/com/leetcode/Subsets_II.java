package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 12/15/17.
 *
 *
 * https://leetcode.com/problems/subsets-ii/description/
 * https://leetcode.com/problems/subsets/discuss/
 *
 *
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets
 * (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * For example, If nums = [1,2,2], a solution is:
 *
 * [ [2], [1], [1,2,2], [2,2], [1,2], [] ]
 */
public class Subsets_II {

  public static void main(String[] args) {
    List result = subsets(new int[]{1, 2, 2});
    System.out.println("This is the result " + result);
  }

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
      int[] nums, int index) {
    list.add(new ArrayList<>(objects));

    for (int i = index; i < nums.length; i++) {
      //if loop starts and current item is same as previous , skip
      if (i > index && nums[i] == nums[i - 1]) {
        continue;
      }
      objects.add(nums[i]);
      generateSubSet(list, objects, nums, i + 1);
      objects.remove(objects.size() - 1);
    }
  }
}
