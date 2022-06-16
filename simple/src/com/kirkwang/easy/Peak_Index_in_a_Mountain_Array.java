package com.kirkwang.easy;

/*

https://leetcode.com/problems/peak-index-in-a-mountain-array/

*/
public class Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        int result = 0;
        int location = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = i + 1; // index result
            }
        }
        return result;
    }


    public static void main(String[] args) {

        //   int[] input = new int[]{1, 2, 3, 8, 6, 10};
        //   int[] input = new int[]{0,1,0};
        //int[] input = new int[]{0,2,1,0};
        int[] input = new int[]{3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(input));
    }
}
