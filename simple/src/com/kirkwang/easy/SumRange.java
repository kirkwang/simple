package com.kirkwang.easy;

import java.util.Arrays;

/**
 * Created by kewang on 12/28/15.
 */
/*

https://leetcode.com/submissions/detail/46640625/

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
        System.out.print(Arrays.toString(total));
    }

    public static void main(String[] args) {
        int[] target = new int[]{-12, 0, 6, -5, 2, -1};
        System.out.print(rangeSum(target, 2, 4));
        //SumRange sr = new SumRange(target);
        //System.out.print(sr.SumRange(2, 4));

    }

    public int SumRange(int s, int e) {
        if (s == 0) {
            return total[e];
        }
        return total[e] - total[s - 1];
    }

    public static int rangeSum(int[] target, int begin, int end) {
        int total = 0;
        for (int i = begin; i <= end; i++) {
            total += target[i];
        }
        return total;
    }

}
