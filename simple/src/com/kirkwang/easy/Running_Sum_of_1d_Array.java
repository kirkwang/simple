package com.kirkwang.easy;
/*
Example 1:
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]
        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]
*/


public class Running_Sum_of_1d_Array {

    public static int[] runningSum(int[] input) {
        if (input == null) {
            return input;
        }
        int[] result = new int[input.length];
        result[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            result[i] = result[i - 1] + input[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] input = new int[]{3, 1, 2, 10, 1};

        input = runningSum(input);
        for (int i : input) {
            System.out.println(i);
        }
    }
}
