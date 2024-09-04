package com.leetcode.hard;



/*
https://leetcode.com/problems/median-of-two-sorted-arrays/description/
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median
of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

import org.testng.Assert;

import java.util.Arrays;

class MergeArrayFindMedian {

    public static void main(String[] args) {
        int[] one = {1, 2};
        int[] two = new int[]{3};

        MergeArrayFindMedian mc = new MergeArrayFindMedian();

        int[] meraged = mc.mergTwoArray(one, two);
        Assert.assertEquals(mc.findMedian(meraged), 2.00000);

        meraged = mc.mergTwoArray(new int[]{1, 2}, new int[]{3, 4});
        Assert.assertEquals(mc.findMedian(meraged), 2.50000);


    }

    public int[] mergTwoArray(int[] one, int[] two) {
        int[] mergedArray = new int[one.length + two.length];
        int index = 0;

        for (int i : one) {
            mergedArray[index++] = i;
        }
        for (int j : two) {
            mergedArray[index++] = j;
        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public double findMedian(int[] input) {
        //Explanation: merged array = [1,2,3] and median is 2.

        double answer;
        if (input.length % 2 != 0) {
            //if it is odd length then get middle element
            answer = input[(input.length - 1) / 2];
        } else {
            int right = input[input.length / 2]; // [1,2,3,4] right = 3
            int left = input[(input.length - 1) / 2]; // [1,2,3,4] left = 2
            answer = (float) (left + right) / 2;
        }

        return answer;
    }
}