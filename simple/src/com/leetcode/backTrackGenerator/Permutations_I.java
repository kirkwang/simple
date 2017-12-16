package com.leetcode.backTrackGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/15/17.
 *
 * https://leetcode.com/problems/permutations/description/
 *
 * Given a collection of distinct numbers, return all possible permutations.
 *
 * For example, [1,2,3] have the following permutations:
 *
 * [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 */
public class Permutations_I {

  public static void main(String[] args) {

    System.out.println("This is the result " + Permutations(new int[]{1, 2, 3}));

  }

  public static List<List<Integer>> Permutations(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return list;
    }
    generator(list, new ArrayList<>(), nums);
    return list;
  }

  private static void generator(List<List<Integer>> list, ArrayList<Integer> sublist, int[] nums) {
    if (sublist.size() == nums.length) {
      list.add(new ArrayList<>(sublist));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (sublist.contains(nums[i])) { //skip if it exists
          continue;
        } else {
          sublist.add(nums[i]); //add to the sublist
          generator(list, sublist, nums);
          sublist.remove(sublist.size() - 1); //remove last one
        }
      }
    }
  }
}
