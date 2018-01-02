package com.kirkwang.easy;

import java.util.HashMap;

/**
 * Created by kewang on 3/3/16.
 *
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class ContainsNearByDubByK {


  //Given an array of integers and an integer k,
  // find out whether there are two distinct indices i and j in the array
  // such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
  public static void main(String[] args) {
    int[] numbs = {1, 4, 5, 1, 56, 22, 4};
    System.out.println(ContainsNearByDub(numbs, 3));
  }

  public static boolean ContainsNearByDub(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        int prevLoc = map.get(nums[i]);
        if (i - prevLoc <= k) {
          return true;
        }
      }
      map.put(nums[i], i);
    }

    return false;
  }

}
