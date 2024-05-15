package com.leetcode.easy;

/**
 * Created by kewang on 12/26/15.
 */
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

 */
public class MergeTwoArraysIntoOne {
    public static void main(String[] args) {

        MergeTwoArraysIntoOne mtaio = new MergeTwoArraysIntoOne();
        int[] one = new int[]{1, 3, 5, 6, 0, 0, 0, 0, 0};
        int[] two = new int[]{1, 2, 2, 2, 10};
        int[] merged = mtaio.mergeTwoArraysIntoOne(one, 4, two, 5);
        for (int a : merged) {
            System.out.print(a + " ");
        }
    }

    public int[] mergeTwoArraysIntoOne(int[] a, int m, int[] b, int n) {
        int theEnd = a.length - 1;
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
