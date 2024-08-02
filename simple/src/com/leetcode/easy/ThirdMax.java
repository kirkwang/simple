package com.leetcode.easy;

import org.testng.Assert;

import java.util.TreeSet;

/*
https://leetcode.com/problems/third-maximum-number/
Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

 */
public class ThirdMax {
    public static void main(String[] args) {
        Assert.assertEquals(thirdMax(new int[]{3, 2, 1}), 1);
        Assert.assertEquals(thirdMax(new int[]{1, 2}), 2);
        Assert.assertEquals(thirdMax(new int[]{2, 2, 3, 1}), 1);
    }

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : nums) {
            treeSet.add(i);
            if (treeSet.size() > 3) {
                treeSet.pollFirst();
            }
        }
        return treeSet.size() < 3 ? treeSet.last() : treeSet.first();
    }
}

