package com.kirkwang.easy;

/**
 * Created by kewang on 12/25/15.
 */
/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

*/
@SuppressWarnings("Array")
public class RotateArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 6, 8};
        RotateArray.intermediaArray(array, 2);
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }

    public static void leftRotatebyOne(int[] input, int n) {

        int temp = input[0];
        for (int i = 0; i < n - 1; i++) {
            input[i] = input[i + 1];
        }
        input[n - 1] = temp;


    }

    public static void intermediaArray(int[] numbs, int val) {

        for (int i = 0; i < val; i++)
            leftRotatebyOne(numbs, numbs.length);
    }


}
