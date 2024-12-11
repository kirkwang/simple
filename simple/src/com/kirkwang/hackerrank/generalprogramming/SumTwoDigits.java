package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

public class SumTwoDigits {
    public static int sumTwoDigits_v1(int n) {
        String[] input = String.valueOf(n).split("");

        int firstInt = Integer.parseInt(input[0]);
        int secondInt = Integer.parseInt(input[1]);

        return firstInt + secondInt;
    }

    public static int sumTwoDigits(int n) {
        int first = n / 10;
        int second = n - first * 10;
        return first + second;
    }

    public static void main(String... args) {

        Assert.assertEquals(sumTwoDigits(29), 11);
        Assert.assertEquals(sumTwoDigits_v1(29), 11);

    }
}
