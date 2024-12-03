package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class ArraysReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        for (int i = 0; i < a.size() / 2; i++) {
            Integer temp = a.get(i);
            int end = a.size() - 1 - i;
            a.set(i, a.get(end));
            a.set(end, temp);
        }
        return a;
    }

    public static void main(String... args) {

        List<Integer> actual = reverseArray(Arrays.asList(1, 4, 3, 2));
        Assert.assertEquals(actual, Arrays.asList(2, 3, 4, 1));
    }
}
