package com.kirkwang.HackerRank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kewang on 10/31/17.
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        MiniMaxSum mms = new MiniMaxSum();

          Integer[] array = new Integer[]{2, 7, 69, 221, 8974};
        //Integer[] array = new Integer[]{256741038, 623958417, 467905213, 714532089, 938071625};
        int[] arr = new int[]{1, 3, 5, 7, 9};
        miniMaxSum(Arrays.asList(array));
        miniMaxSum_v1(array);
    }

    public static void miniMaxSum(List<Integer> arr) {
        java.util.Arrays.sort(new List[]{arr});
        Long min = Long.valueOf(arr.get(0));
        Long max = Long.valueOf(arr.get(arr.size() - 1));

        for (int i = 1; i < arr.size() - 1; i++) {
            min = min + arr.get(i);
            max = max + arr.get(arr.size() - 1 - i);
        }

        System.out.println(min + " " + max);
    }

    public static Integer miniMaxSum_v1(Integer[] input) {
        Integer mini = 0;
        Integer max = 0;

        for (int i = 0; i < input.length; i++) {
            if (i + 1 <= input.length - 1) { //look one ahead to check if it has reach the end.
                mini += input[i];
            }

            max += input[input.length - 1 - i]; //sum while going backward

        }
        max = max - input[0]; // skip the 1st one
        System.out.println("miniMaxSum_v1 mini " + mini + " max " + max);
        return mini;
    }
}
