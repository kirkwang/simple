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
        RotateArray ra = new RotateArray();
        int[] array = new int[]{1, 2, 3, 4, 6, 8};
        ra.intermediaArray(array, 2);
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }

    public void intermediaArray(int[] numbs, int val) {
        if (val > numbs.length) {
            val = val % numbs.length; // id val = 10%3;
        }
        int[] result = new int[numbs.length];

        for (int i = 0; i < val; i++) {
            result[i] = numbs[numbs.length - val + i];
        }// copy the val ~ end to result at the beginning.

        int j = 0;

        // loop begins at val to the end
        for (int i = val; i < numbs.length; i++) {
            result[i] = numbs[j++];
        }
        System.arraycopy(result, 0, numbs, 0, numbs.length);
    }
    public void rotateArray(int[] numbs, int val) {
        if (numbs == null || numbs.length == 0) {
            // return numbs;
            //return;
        }
        val %= numbs.length;
        int[] result = new int[numbs.length];
        for (int i = 0; i < val; i++) {
            result[i] = numbs[numbs.length - val + i];
            // val--;
        }
        int index = 0;
        for (int i = val; i < numbs.length; i++) {
            result[i] = numbs[index++];
        }
        System.arraycopy(result, 0, numbs, 0, numbs.length);
        // return numbs;
    }
}
