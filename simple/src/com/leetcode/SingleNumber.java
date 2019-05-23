/*
 * 4/17/19 10:03 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

/*
https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
public class SingleNumber {
    public static int SingleElementinaSortedArray(int[] input) {
        if (input.length == 1) {
            return input[0];
        }

        for (int i = 0, j = 1; i < input.length - 1; i = i + 2) {
            if (input[i] != input[j]) {
                return input[i];
            }
            j = j + 2;
        }
        return 0;
    }


    public static void main(String[] args) {
        //This bug is that it worn't work if it's the end
        int[] integers = new int[]{1, 1, 2, 2, 3, 3, 4};
        String abc = "abc";
        abc.substring(0, 1);
        SingleNumber singleNumber = new SingleNumber();
        int result = SingleElementinaSortedArray(integers);
        System.out.println("SingleElementinaSortedArray " + result);
    }
}
