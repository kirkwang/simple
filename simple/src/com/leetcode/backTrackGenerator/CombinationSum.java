package com.leetcode.backTrackGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 12/16/17.
 * <p>
 * https://leetcode.com/problems/combination-sum/description/
 * <p>
 * <p>
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all
 * unique combinations in C where the candidate numbers sums to T.
 * <p>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p>
 * Note:
 * <p>
 * All numbers (including target) will be positive integers. The solution set must not contain
 * duplicate combinations.
 * <p>
 * For example, given candidate set [2, 3, 6, 7] and target 7, A solution set is:
 * <p>
 * [ [7], [2, 2, 3] ]
 */
public class CombinationSum {

  public static List<List<Integer>> CombinationSum(int[] canidate, int target) {
    List<List<Integer>> list = new ArrayList<>();
    if (canidate == null || canidate.length == 0) {
      return list;
    }
    Arrays.sort(canidate);

    generator(list, new ArrayList<>(), canidate, target, 0);
    return list;
  }

  private static void generator(List<List<Integer>> list, ArrayList<Integer> sublist,
      int[] canidate, int target, int index) {

    if (target == 0) {
      list.add(new ArrayList<Integer>(sublist));
    } else if (target < 0) {

      return;

    } else {
      for (int i = index; i < canidate.length; i++) {
        if (i == index || canidate[i] != canidate[i
            - 1]) { //The if is for check duplicate. No "if" needed if there is no dup
          sublist.add(canidate[i]);
          generator(list, sublist, canidate, target - canidate[i], i);
          //i + 1 will not reuse the item. for unique result set
          sublist.remove(sublist.size() - 1);
        }
      }
    }
  }

  public static void main(String[] args) {
    int target = 7;
    System.out.println("This is the target " + target);

    System.out.println("This is the result " + CombinationSum(new int[]{2, 3, 3, 6, 7}, target));

  }
}
