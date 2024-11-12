package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.*;

public class MissingNumbers {


    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (Integer b : brr) {
            myMap.put(b, myMap.getOrDefault(b, 0) + 1);
        }
        for (Integer a : arr) {
            if (myMap.containsKey(a))
                myMap.put(a, myMap.get(a) - 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : myMap.entrySet()) {
            if (e.getValue() > 0) {
                result.add(e.getKey());
            }
        }

        return result;
    }

    public static void main(String... args) {

        List<Integer> actual = missingNumbers(Arrays.asList(7, 2, 5, 3, 5, 3), Arrays.asList(7, 2, 5, 4, 6, 3, 5, 3));
        Assert.assertEquals(actual, Arrays.asList(4, 6));
    }
}
