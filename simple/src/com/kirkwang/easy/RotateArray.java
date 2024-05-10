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

        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        RotateArray.routeLeft(array, 2);
        System.out.println("routeLeft");
        for (int j : array) {
            System.out.print(j + " ");
        }
        //put it back by shift to the right
        RotateArray.routeRight(array, 2);
        System.out.println("routeRight");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void routeLeft(int[] input, int count) {
        if (count > input.length) {
            count = count % input.length;
        }
        for (int i = 0; i < count; i++) {
            routeLeftByOne(input, input.length);
        }
    }

    private static void routeLeftByOne(int[] array, int length) {
        //[1,2,3,4,5,6,7]
        //[2,3,4,5,6,7,1]
        int temp = array[0];
        for (int i = 0; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[length - 1] = temp;

    }

    public static void routeRight(int[] nums, int k) {
        if (k > nums.length) {
            k %= nums.length;
        }
        for (int i = 0; i < k; i++) {
            routeRightByOne(nums, nums.length);
        }
    }

    private static void routeRightByOne(int[] array, int length) {
        length--;
        int temp = array[length];
        for (int i = 0; i < length; i++) {
            array[length - i] = array[length - i - 1];
        }
        array[0] = temp;

    }

}
