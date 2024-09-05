package com.leetcode.easy;

import org.testng.Assert;

/**
 * Created by kewang on 12/24/15.
 */

/*
  https://leetcode.com/problems/move-zeroes/
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
@SuppressWarnings("Array")
public class MoveZeroes {

    public static void main(String[] args) {
        int[] sorted = moveZeroes(new int[]{1, 0, 2, 30, 0});
        Assert.assertEquals(sorted, new int[]{1, 2, 30, 0, 0});
    }

    public static int[] moveZeroes(int[] numbs) {
        int index = 0;

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] != 0) {
                numbs[index++] = numbs[i];
            }
        }
        while (index < numbs.length) {
            numbs[index++] = 0;
        }
        return numbs;
    }

}
