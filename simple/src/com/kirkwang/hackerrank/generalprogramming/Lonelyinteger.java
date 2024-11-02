package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lonelyinteger {
    public static int lonelyinteger(List<Integer> a) {
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
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);

        Assert.assertEquals(lonelyinteger(arrayList), 2);
    }
}
