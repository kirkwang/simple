package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (Integer i : a) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> set : hashMap.entrySet()) {
            if (set.getValue() == 1) {
                return set.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Assert.assertEquals(lonelyInteger(Arrays.asList(1, 1, 2)), 2);
    }
}
