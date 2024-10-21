package com.kirkwang.HackerRank.generalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kewang on 10/31/17.
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MiniMaxSum {

    public static void main(String[] args) {

        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(Arrays.asList(1, 3, 5, 7, 9));
        miniMaxSum(Arrays.asList(2, 7, 69, 221, 8974));
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }
    public static void miniMaxSum(List<Integer> arr) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for (Integer i : arr) {
            sum = sum + i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        System.out.println((sum - max) + " " + (sum - min));

    }

    public static void miniMaxSum_soft(List<Integer> arr) {

        Collections.sort(arr);
        Long min = Long.valueOf(arr.get(0));
        Long max = Long.valueOf(arr.get(arr.size() - 1));

        for (int i = 1; i < arr.size() - 1; i++) {
            min = min + arr.get(i);
            max = max + arr.get(arr.size() - 1 - i);
        }

        System.out.println(min + " " + max);

    }


}
