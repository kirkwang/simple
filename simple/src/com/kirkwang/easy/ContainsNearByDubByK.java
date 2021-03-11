package com.kirkwang.easy;

import java.util.HashMap;

/**
 * Created by kewang on 3/3/16.
 * <p>
 * https://just4once.gitbooks.io/leetcode-notes/content/leetcode/hash-table/219-contains-duplicate-ii.html
 */
public class ContainsNearByDubByK {


    //Given an array of integers and an integer k,
    // find out whether there are two distinct indices i and j in the array
    // such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
    public static void main(String[] args) {
        int[] numbs = {1, 4, 5, 2, 1, 56, 22, 4};
        System.out.println(ContainsNearByDub(numbs, 3));
    }

    public static boolean ContainsNearByDub(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                Integer preLoc = hm.get(nums[i]);
                if (i - preLoc <= k) return true;

            } else {
                hm.put(nums[i], i);
            }

        }

        return false;
    }

}
