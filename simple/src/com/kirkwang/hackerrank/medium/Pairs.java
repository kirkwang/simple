package com.kirkwang.hackerrank.medium;

import org.testng.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pairs {


    public static int pairs(int k, List<Integer> arr) {
        HashSet<Integer> hm = new HashSet<>();
        int pairsCount = 0;

        for (int num : arr) {
            if (hm.contains(Math.abs(k - num))) {
                pairsCount++;
            }
            if (hm.contains(k + num)) {
                pairsCount++;
            }
            hm.add(num);
        }

        return pairsCount;
    }

    public static void main(String... args) {

        Assert.assertEquals(pairs(2, Arrays.asList(1, 5, 3, 4, 2)), 3);
    }
}
