package com.kirkwang.HackerRank;

/**
 * Created by kewang on 10/31/17.
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        MiniMaxSum mms = new MiniMaxSum();

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        int[] arr = new int[]{1, 3, 5, 7, 9};
        mms.miniMaxSum(arr);
    }

    public Integer miniMaxSum(int[] input) {
        Integer mini = 0;
        Integer max = 0;

        for (int i = 0; i < input.length; i++) {
            if (i + 1 <= input.length - 1) { //check if it has reached the end
                mini += input[i];

            }

            max += input[input.length - i - 1]; //sum while going backward

        }
        max = max - input[0];
        System.out.println(" mini " + mini + " max " + max);
        return mini;
    }
}
