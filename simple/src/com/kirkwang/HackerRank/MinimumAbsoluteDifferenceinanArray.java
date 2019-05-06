/*
 * 5/5/19 11:07 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceinanArray {
    public static void main(String[] args) {

        int[] array = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        int result = minimumAbsoluteDifference(array);
        // for (int i : result) {
        System.out.println(result);
        //}
    }

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i] - arr[i - 1], min);
        }
        return min;
    }
}
