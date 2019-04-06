/*
 * 4/5/19 8:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

import java.util.Arrays;

public class Maximum3integers {
    public static int maximum3Integers(int[] input) {
        int result = 0;
        if (input.length < 3) {
            return result;
        }

        Arrays.sort(input);

        if (input[0] <= 0) {
            return input[input.length - 1] * input[input.length - 2] * input[input.length - 3];
        }
        if (input[0] < 0 && input[1] < 0) {
            return input[input.length - 1] * input[0] * input[1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 67, 28, 0, -1, -30, -20};
        int result = Maximum3integers.maximum3Integers(array);

        System.out.println(result);
    }
}
