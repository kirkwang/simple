/*
 * 4/3/19 5:17 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.hard;

import org.testng.Assert;

/*
https://leetcode.com/problems/median-of-two-sorted-arrays/description/
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianOfTwoSortedArray {
    public static float findMedianOfTwoSortedArray(int[] nums1, int[] nums2) {


        int pa = 0;
        int pb = 0;
        int[] combined = new int[nums1.length + nums2.length];

        int index = 0;

        while (pa < nums1.length && pb < nums2.length) {
            if (nums1[pa] <= nums2[pb]) {
                combined[index] = nums1[pa++];
            } else {
                combined[index] = nums2[pb++];
            }
            index++;
        }

        while (pa < nums1.length) {
            combined[index++] = nums1[pa++];
        }
        while (pb < nums2.length) {
            combined[index++] = nums2[pb++];
        }

        if (combined.length % 2 == 0) {
            float total = combined[combined.length / 2 - 1] + combined[combined.length / 2];
            return total / 2;
        } else {
            return combined[combined.length / 2];
        }

//https://sites.google.com/site/spaceofjameschen/home/array/find-the-median-in-two-sorted-array
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        float result = MedianOfTwoSortedArray.findMedianOfTwoSortedArray(arr1, arr2);
        Assert.assertEquals(result, 2.5F);
        Assert.assertEquals((double) result, 2.50000);

        result = MedianOfTwoSortedArray.findMedianOfTwoSortedArray(new int[]{1, 3}, new int[]{2});
        Assert.assertEquals(result, 2.0F);

    }
}
