package com.kirkwang.hackerrank;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLeft {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        d = d % arr.size();
        List<Integer> result = new ArrayList<>();
        result.addAll(arr.subList(d, arr.size()));
        result.addAll(arr.subList(0, d));
        return result;
    }


    public static void main(String[] args) {

        List<Integer> actual = rotateLeft(2, Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(actual, Arrays.asList(3, 4, 5, 1, 2));

        actual = rotateLeft(5, Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(actual, Arrays.asList(1, 2, 3, 4, 5));

        actual = rotateLeft(4, Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(actual, Arrays.asList(5, 1, 2, 3, 4));

        actual = rotateLeft(7, Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(actual, Arrays.asList(3, 4, 5, 1, 2));

    }
}
