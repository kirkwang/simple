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
 */
public class ThirdMax {
    public static void main(String[] args) {
        Assert.assertEquals(thirdMax(new int[]{3, 2, 1}), 1);
        Assert.assertEquals(thirdMax(new int[]{2, 2, 5, 3}), 2);
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

