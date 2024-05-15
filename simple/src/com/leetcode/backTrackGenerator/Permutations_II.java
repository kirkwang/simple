package com.leetcode.backTrackGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 12/15/17.
 * <p>
 * https://leetcode.com/problems/permutations-ii/description/
 * <p>
 * <p>
 * https://leetcode.com/problems/subsets/discuss/
 * <p>
 * <p>
 * Given a collection of numbers that might contain duplicates, return all possible unique
 * permutations.
 * <p>
 * For example, [1,1,2] have the following unique permutations:
 * <p>
 * [ [1,1,2], [1,2,1], [2,1,1] ]
 */

@Deprecated
public class Permutations_II {

    public static void main(String[] args) {

        System.out.println("This is the result " + Permutations_ii(new int[]{1, 2, 3}));

    }

    private static List<List<Integer>> Permutations_ii(int[] ints) {
        List<List<Integer>> list = new ArrayList<>();
        if (ints == null | ints.length == 0) {
            return list;
        }
        Arrays.sort(ints);
        generator(list, new ArrayList<>(), ints);
        return list;
    }

    private static void generator(List<List<Integer>> list, ArrayList<Integer> subList, int[] ints) {
        if (subList.size() == ints.length) {
            list.add(subList);
        } else {

            for (int i = 0; i < ints.length; i++) {
                //  if(ints[i] ){}
            }


        }

    }

}
