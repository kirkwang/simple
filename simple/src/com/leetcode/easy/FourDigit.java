package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FourDigit {


    public static boolean checkEven(int input) {
        // Declaring object of Integer type

        // Adding all elements to List
        Set<Integer> a = new HashSet<>(Arrays.asList(2, 4, 6, 8, 0));

        return a.contains(input);
    }

    public static boolean checkFirstDigi(int input) {
        int hunad = input / 100; //1
        int tenth = input % 100 / 10; //126 2
        int single = input % 100 % 10; //126 26%10  6

        return !checkEven(hunad) && checkEven(tenth) && checkEven(single);
    }

    public static boolean checkSecondDigi(int input) {
        int tenth = input / 10;
        int single = input % 10;

        return checkEven(tenth) && checkEven(single);
    }

    public static boolean checkResult(int input) {
        int thousand = input / 1000;
        int hunad = input % 1000 / 100;
        int tenth = input % 100 / 10;
        int single = input % 100 % 10;

        return !checkEven(thousand) && !checkEven(hunad) && checkEven(tenth) && checkEven(single);
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 988; i = i + 2) {
            for (int j = 20; j <= 88; j = j + 2) {
                if (checkFirstDigi(i) && checkSecondDigi(j)) {
                    int result = i * j;
                    if (result < 9988) {
                        if (checkResult(result)) {
                            System.out.println("The answer is  " + result + ", i " + i + " j " + j);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("total " + count);

    }
}




