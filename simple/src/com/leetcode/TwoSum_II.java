package com.leetcode;

import java.util.HashMap;

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

  public static int[] TwoSum_II(int[] numbs, int index, int total) {

    int head = index;
    int tail = numbs.length - 1;

    while (head <= tail && numbs[head] + numbs[tail] != total) {
      int sum = numbs[tail] + numbs[head];
      if (sum < total) {
        head++;
      } else {
        tail--;
      }
    }
    return new int[]{head + 1, tail + 1};
  }

    public static int[] TwoSum_III(int[] numbs, int total) {
        if (numbs == null || numbs.length < 2) {
            return null;
        }
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < numbs.length; i++) {
            if (hashMap.containsKey(numbs[i])) {
                return new int[]{hashMap.get(numbs[i]), i};
            } else {
                hashMap.put(total - numbs[i], i);
            }
        }

        return new int[]{0, 0};
    }
  public static void main(String[] args) {
    int[] result = TwoSum_II(new int[]{1, 2, 7, 15}, 0, 9);
      result = TwoSum_III(new int[]{1, 2, 7, 15}, 90);
    for (int sum : result) {
      System.out.println(sum);
    }
  }
}
