package com.leetcode.easy;

import org.testng.Assert;

/**
 * Created by kewang on 12/26/15.
 */
/*
https://leetcode.com/problems/merge-sorted-array/description/
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

 */
public class MergeTwoArraysIntoOne {
    public static void main(String[] args) {

        MergeTwoArraysIntoOne mtaio = new MergeTwoArraysIntoOne();
        int[] one = new int[]{1, 3, 5, 6, 0, 0, 0, 0, 0};
        int[] two = new int[]{1, 2, 2, 2, 10};
        int[] merged = mtaio.mergeTwoArraysIntoOne(one, 4, two, 5);
        Assert.assertEquals(merged, new int[]{1, 1, 2, 2, 2, 3, 5, 6, 10});


        merged = mtaio.mergeTwoArraysIntoOne(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        Assert.assertEquals(merged, new int[]{1, 2, 2, 3, 5, 6});

    }

    public int[] mergeTwoArraysIntoOne(int[] a, int m, int[] b, int n) {
        while (m > 0 && n > 0) {
            int aEnd = m - 1;
            int bEnd = n - 1;
            if (a[aEnd] > b[bEnd]) {
                a[aEnd + n] = a[aEnd];
                m--;
            } else {
                a[aEnd + n] = b[bEnd];
                n--;
            }
        }
        while (n > 0) {
            a[m + n - 1] = b[n - 1];
            n--;
        }
        return a;
    }
}
