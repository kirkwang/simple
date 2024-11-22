package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int counterA = 0;
        int counterB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                counterA++;
            } else if (a.get(i) < b.get(i)) {
                counterB++;
            }

        }

        return Arrays.asList(counterA, counterB);
    }

    public static void main(String... args) {
        List<Integer> actual = compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10));
        Assert.assertEquals(actual, Arrays.asList(1, 1));

        actual = compareTriplets(Arrays.asList(17, 28, 30), Arrays.asList(99, 16, 8));
        Assert.assertEquals(actual, Arrays.asList(2, 1));
    }
}
