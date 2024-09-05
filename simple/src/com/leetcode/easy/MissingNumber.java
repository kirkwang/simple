package com.leetcode.easy;
/*
  https://leetcode.com/problems/missing-number/description/
  Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
  Example 1:
  <p>
  Input: nums = [3,0,1]
  Output: 2
  Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
  Example 2:
  <p>
  Input: nums = [0,1]
  Output: 2
  Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
  Example 3:
  <p>
  Input: nums = [9,6,4,2,3,5,7,0,1]
  Output: 8
  Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */

import org.testng.Assert;

public class MissingNumber {
    public static void main(String[] args) {

        Assert.assertEquals(missingNumber(new int[]{0, 1, 3}), 2);
        Assert.assertEquals(missingNumber(new int[]{0, 1}), 2);
        Assert.assertEquals(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}), 8);
    }

    public static int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;  // (3 * 4) /2 = 6 , 6 - 1 -3 = 2
        int actualSum = 0;
        for (int i : nums) {
            actualSum = actualSum + i;
        }

        return expectedSum - actualSum;
    }
}
