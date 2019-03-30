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
        int[] array = new int[]{11, 22, 3};
        //  System.out.println("This is the result Permutations" + Permutations(new int[]{1, 2, 3}));
        System.out.println("This is the result permute " + permute(array));

    }

    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        //start from an empty list
        result.add(new ArrayList<Integer>());

        for (int i = 0; i < num.length; i++) {
            //list of list in current iteration of the array num
            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();

            for (ArrayList<Integer> l : result) {
                // # of locations to insert is largest index + 1
                for (int j = 0; j < l.size() + 1; j++) {
                    // + add num[i] to different locations
                    l.add(j, num[i]);
                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);
                    for (int k = 0; k < temp.size(); k++) {
                        System.out.println("temp " + temp.get(k));
                    }
                    l.remove(j);           // - remove num[i] add
                    for (int k = 0; k < l.size(); k++) {
                        System.out.println("l value " + l);
                    }
                }
            }

            result = new ArrayList<ArrayList<Integer>>(current);
        }

        return result;
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
