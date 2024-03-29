package com.leetcode;

/**
 * Created by kewang on 12/22/17.
 * <p>
 * https://leetcode.com/problems/two-sum/description/
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
    int[] result = TwoSum(new int[]{1, 2, 7, 15}, 9);
    assert result != null;
    System.out.print(result[0] + " " + result[1]);
  }

  public static int[] TwoSum(int[] input, int total) {
    for (int i = 0; i < input.length; i++) {
      for (int j = i + 1; j < input.length; j++) {
        if (total - input[i] == input[j]) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }
}
