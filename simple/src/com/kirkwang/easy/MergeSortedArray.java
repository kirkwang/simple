package com.kirkwang.easy;

/**
 * Created by kewang on 12/25/15.
 * https://leetcode.com/problems/merge-sorted-array/
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();

        int[] one = new int[]{1, 3, 5};
        int[] two = new int[]{1, 2, 2, 2, 10};
        int[] merged = msa.mergeSortedArray(one, two);
        for (int aMerged : merged) {
            System.out.print(aMerged + " ");
        }
    }

    public int[] mergeSortedArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int pa = 0;
        int pb = 0;
        int index = 0;
        while (pa < a.length && pb < b.length) {
            if (a[pa] < b[pb]) {
                result[index++] = a[pa++];
            } else {
                result[index++] = b[pb++];
            }
        }
        while (pa < a.length) {
            result[index++] = a[pa++];
        }
        while (pb < b.length) {
            result[index++] = b[pb++];
        }
        return result;
    }
}
