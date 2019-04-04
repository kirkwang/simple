/*
 * 4/3/19 5:17 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

public class MedianOfTwoSortedArray {
    public static void findMedianOfTwoSortedArray(int[] arr1, int[] arr2) {
        int pa = 0;
        int pb = 0;
        int[] combined = new int[arr1.length + arr2.length];

        int index = 0;

        while (pa < arr1.length && pb < arr2.length) {
            if (arr1[pa] <= arr2[pb]) {
                combined[index] = arr1[pa++];
            } else {
                combined[index] = arr2[pb++];
            }
            index++;
        }

        if (pa < arr1.length) {
            combined[index] = arr1[pa++];
        }
        if (pb < arr2.length) {
            combined[index] = arr2[pb++];
        }

        for (int i = 0; i < combined.length; i++) {
            System.out.println(combined[i] + " ");
        }
        int median = combined.length / 2;
//https://sites.google.com/site/spaceofjameschen/home/array/find-the-median-in-two-sorted-array

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 2, 3, 5, 8, 9};
        MedianOfTwoSortedArray.findMedianOfTwoSortedArray(arr1, arr2);
    }
}
