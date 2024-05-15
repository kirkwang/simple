/*
 * 4/17/19 10:03 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/single-element-in-a-sorted-array/
https://leetcode.com/problems/single-number/
singleNonDuplicate
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1

 */
public class SingleNumber {

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.iterator().next();
    }


    public static void main(String[] args) {
        int[] integers = new int[]{1, 2, 2, 3, 3, 4, 4};


        System.out.println("SingleElementinaSortedArray " + singleNonDuplicate(integers));
    }
}
