package com.kirkwang.hackerrank.generalprogramming;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {


    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        float a = 0;
        float b = 0;
        float c = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                a++;
            }
            if (integer < 0) {
                b++;
            }
            if (integer == 0) {
                c++;
            }
        }
        float numa = a / n;
        float numb = b / n;
        float numc = c / n;
        System.out.printf("%.6f%n", numa);
        System.out.printf("%.6f%n", numb);
        System.out.printf("%.6f%n", numc);

    }


    public static void main(String... args) {
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }
}
