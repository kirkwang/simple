package com.leetcode.backTrackGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/15/17.
 * <p>
 * https://leetcode.com/problems/permutations/description/
 * <p>
 * Given a collection of distinct numbers, return all possible permutations.
 * <p>
 * For example, [1,2,3] have the following permutations:
 * <p>
 * [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 */
public class Permutations_I {

    public static void main(String[] args) {
        int[] array = new int[]{11, 22, 3};
        System.out.println("This is the result Permutations" + Permutations(new int[]{1, 2, 3}));
        // System.out.println("This is the result permute " + permute(array));

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
                    for (Integer integer : temp) {
                        System.out.println("temp " + integer);
                    }
                    l.remove(j);           // - remove num[i] add
                    for (int k = 0; k < l.size(); k++) {
                        System.out.println("l value " + l);
                    }
                }
            }

            result = new ArrayList<>(current);
        }

        return result;
    }

    public static List<List<Integer>> Permutations(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permute(list, new ArrayList<>(), nums);
        return list;
    }

    public static void permute(List<List<Integer>> list, List subList, int[] nums) {
        if (subList.size() == nums.length) {
            list.add(new ArrayList(subList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (subList.contains(nums[i])) {
                    continue;
                } else {
                    subList.add(nums[i]);
                    permute(list, subList, nums);
                    subList.remove(subList.size() - 1);
                }
            }
        }
    }
}
