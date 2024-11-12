package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IcecreamParlor {


    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++)
                if (m == arr.get(i) + arr.get(j)) {
                    result.add(i + 1);
                    result.add(j + 1);
                }
        }
        return result;
    }

    public static void main(String... args) {

        Assert.assertEquals(icecreamParlor(4, Arrays.asList(1, 2, 3)), Arrays.asList(1, 3));

        Assert.assertEquals(icecreamParlor(4, Arrays.asList(1, 4, 5, 3, 2)), Arrays.asList(1, 4));


    }
}
