package com.leetcode.backTrackGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 12/15/17.
 * <p>
 * <p>
 * https://leetcode.com/problems/subsets-ii/description/ https://leetcode.com/problems/subsets/discuss/
 * <p>
 * <p>
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets
 * (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * For example, If nums = [1,2,2], a solution is:
 * <p>
 * [ [2], [1], [1,2,2], [2,2], [1,2], [] ]
 */
public class Subsets_II {

  public static void main(String[] args) {
    List result = subsets(new int[]{1, 2, 2});
    System.out.println("This is the result " + result);
  }

  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    permute(result, new ArrayList(), nums, 0);
    return result;
  }

  public static void permute(List list, List subList, int[] nums, int index) {
    list.add(new ArrayList<>(subList));
    for (int i = index; i < nums.length; i++) {
      if (i > index && nums[i - 1] == nums[i]) {
        continue;
      }
      subList.add(nums[i]);
      permute(list, subList, nums, i + 1);
      subList.remove((subList.size() - 1));
    }
  }

}
