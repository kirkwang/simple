package com.leetcode.easy;

import org.testng.Assert;

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
    private static Integer majorityElement_fast(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    protected static Integer majorityElement_slow(int[] nums) {
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
        Assert.assertEquals((int) MajorityElement.majorityElement_fast(new int[]{3, 2, 3}), 3);
        Assert.assertEquals((int) MajorityElement.majorityElement_fast(new int[]{2, 2, 1, 1, 1, 2, 2}), 2);


        Assert.assertEquals((int) MajorityElement.majorityElement_slow(new int[]{3, 2, 3}), 3);
        Assert.assertEquals((int) MajorityElement.majorityElement_slow(new int[]{2, 2, 1, 1, 1, 2, 2}), 2);
    }

    protected static class TestClassPrivateAccess {

        public static String name = "I'm a static variable";

        TestClassPrivateAccess() {
            System.out.println("I'm a private class");
        }
    }
}
