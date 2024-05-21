package com.leetcode.easy;

import org.testng.Assert;

import java.util.Arrays;

/**
 * Created by kewang on 12/28/15.
 */
/*

https://leetcode.com/submissions/detail/46640625/
https://leetcode.com/problems/range-sum-query-immutable/description/

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
 */
public class SumRange {

    private final int[] total;

    public SumRange(int[] numbs) {
        for (int i = 1; i < numbs.length; i++) {
            numbs[i] = numbs[i - 1] + numbs[i];

        }
        this.total = numbs;
        System.out.println("SumRange " + Arrays.toString(total));
    }

    public static void main(String[] args) {
        int[] target = new int[]{-2, 0, 3, -5, 2, -1};

        SumRange sr = new SumRange(target);

        Assert.assertEquals(sr.SumRange(0, 2), 1);
        Assert.assertEquals(sr.SumRange(2, 5), -1);
        Assert.assertEquals(sr.SumRange(0, 5), -3);
    }

    public static int rangeSum(int[] target, int begin, int end) {
        int total = 0;
        for (int i = begin; i <= end; i++) {
            total += target[i];
        }
        return total;
    }

    public int SumRange(int start, int end) {
        if (start == 0) {
            return total[end];
        }
        return total[end] - total[start - 1];
    }

}
