/*
 * 4/24/19 12:45 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class AppleAndOrange {

    public static void main(String[] args) {

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        System.out.println(countApplesAndOranges(s, t, a, b, apples, oranges)[0]);
        System.out.println(countApplesAndOranges(s, t, a, b, apples, oranges)[1]);
    }

    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = countFallOn(Arrays.stream(apples).map(apple -> a + apple), s, t);
        int orangeCount = countFallOn(Arrays.stream(oranges).map(orange -> b + orange), s, t);
        return new int[]{appleCount, orangeCount};
    }

    static int countFallOn(IntStream locations, int s, int t) {
        return (int) locations.filter(location -> location >= s && location <= t).count();
    }
}
