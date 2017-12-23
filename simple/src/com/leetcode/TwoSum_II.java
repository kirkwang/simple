package com.leetcode;

/**
 * Created by kewang on 12/22/17.
 *
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution and you may not use the same
 * element twice.
 *
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */

public class TwoSum_II {

  public static int[] TwoSum_II(int[] numbs, int total) {

    int head = 0;
    int tail = numbs.length - 1;

    while (numbs[head] + numbs[tail] != total) {
      int sum = numbs[tail] + numbs[head];
      if (sum < total) {
        head++;
      } else {
        tail--;
      }
    }
    return new int[]{numbs[head], numbs[tail]};
  }

  public static void main(String[] args) {
    int[] result = TwoSum_II(new int[]{1, 2, 7, 15}, 9);
    System.out.print(String.valueOf(result[1]));
  }
}
