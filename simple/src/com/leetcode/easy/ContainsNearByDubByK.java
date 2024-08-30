package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashMap;

/**
 * Created by kewang on 3/3/16.
 * <p>
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsNearByDubByK {


    //Given an array of integers and an integer k,
    // find out whether there are two distinct indices i and j in the array
    // such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
    public static void main(String[] args) {
        Assert.assertFalse(ContainsNearByDub(new int[]{1, 4, 5, 2, 1, 56, 22, 4}, 3));
        Assert.assertFalse(ContainsNearByDub(new int[]{1, 2, 3, 1, 2, 3}, 2));
        Assert.assertTrue(ContainsNearByDub(new int[]{1, 2, 3, 1}, 3));
        Assert.assertTrue(ContainsNearByDub(new int[]{1, 0, 1, 1}, 1));

    }

    public static boolean ContainsNearByDub(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i])) {
                int prevLoc = myMap.get(nums[i]);
                if (i - prevLoc <= k) {
                    return true;
                }
            }
            myMap.put(nums[i], i);
        }
        return false;
    }

}
