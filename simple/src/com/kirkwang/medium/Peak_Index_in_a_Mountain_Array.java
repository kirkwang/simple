package com.kirkwang.medium;

/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/
Example 1:

Input: arr = [0,1,0]
Output: 1

Example 3:

Input: arr = [0,10,5,2]
Output: 1


*/
public class Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        // This is wrong. ie 1, 2, 11, 8, 6, 10. it should be 11. but it gives 10.
        int result = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = i + 1; // index result
            }
        }
        return result;
    }

    public static int peak_Index_InMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else
                end = mid;
        }
        return end;

    }

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 11, 8, 6, 10};
        //  int[] input = new int[]{18,29,38,59,98,100,99,98,90};
        //int[] input = new int[]{0,2,1,0};
        //int[] input = new int[]{3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(input));
        System.out.println(peak_Index_InMountainArray(input));
    }
}
