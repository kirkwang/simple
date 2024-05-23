package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by kewang on 12/29/15.
 */
/*

https://leetcode.com/problems/majority-element/description/

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    private static Integer majorityElement_V2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    protected static Integer majorityElement(int[] nums) {
        HashMap<Integer, Integer> mMap = new HashMap<>();
        for (int numb : nums) {

            mMap.put(numb, mMap.getOrDefault(numb, 0) + 1);

        }
        for (int temp : mMap.keySet()) {
            if (mMap.get(temp) > nums.length / 2) {
                return temp;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 3};
        //int[] array = new int[]{2, 2, 1, 1, 1, 2, 2};
        //   int[] array = {1, 1, 2, 4, 4, 4, 4, 4, 5};

        Integer me = MajorityElement.majorityElement(array);
        // me = MajorityElement.majorityElement_V2(array);

        System.out.print(me);
    }

    protected static class TestClassPrivateAccess {

        public static String name = "I'm a static variable";

        TestClassPrivateAccess() {
            System.out.println("I'm a private class");
        }
    }
}
