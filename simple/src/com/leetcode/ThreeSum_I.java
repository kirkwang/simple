package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 12/23/17.
 *
 *
 * https://leetcode.com/problems/3sum/description/
 *
 *
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all
 * unique triplets in the array which gives the sum of zero.
 *
 * Note: The solution set must not contain duplicate triplets.
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 */
@Deprecated // not coded yet
public class ThreeSum_I {

  public static int[] ThreeSum_I_basedOn2forloop(int[] input) {
    Arrays.sort(input);

    for (int i = 0; i < input.length; i++) {
      for (int j = i + 1; j < input.length; j++) {
        if (input[j] + input[i] == 0) {
          return new int[]{
              input[i], input[j]
          };
        }
      }
    }
    return null;
  }


  public static List<List<Integer>> ThreeSum_I_basedOn2endsWhileLoop(int[] input) {
    Arrays.sort(input);
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < input.length; i++) {
      int expectedSum = 0 - input[i];
      int[] locationList = TwoSum_II(input, i + 1, expectedSum);

      if (input[i] + input[locationList[0] - 1] + input[locationList[1] - 1] == 0) {
        List<Integer> o = new ArrayList<>();
        o.add(input[i]);
        o.add(input[locationList[0] - 1]);
        o.add(input[locationList[1] - 1]);
        result.add(o);
      }

    }

    return result;
  }

  public static int[] TwoSum_II(int[] numbs, int index, int total) {

    int head = index;
    int tail = numbs.length - 1;

    while (head < tail) {

      int sum = numbs[tail] + numbs[head];

      if (sum == total) {
        return new int[]{head + 1, tail + 1};
      } else if (sum < total) {
        head++;
      } else {
        tail--;
      }

    }
    head = head > tail ? tail : head;
    return new int[]{head + 1, tail + 1};
  }

  public static void main(String[] args) {

    //   List<List<Integer>> result = ThreeSum_I_basedOn2endsWhileLoop(new int[]{-1, 0, 1, 2, -1});
    List<List<Integer>> result = ThreeSum_I_basedOn2endsWhileLoop(new int[]{-1, 0, 1, 2, -1, -4});
    // List<List<Integer>> result = ThreeSum_I_basedOn2endsWhileLoop(new int[]{1, 0, -4});

  }


}
