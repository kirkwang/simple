package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.*;

public class MatchingStrings {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> myMap = new HashMap<>();
        for (String s : stringList) {
            myMap.put(s, myMap.getOrDefault(s, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();

        for (String s : queries) {
            if (myMap.containsKey(s)) {
                Integer temp = myMap.get(s);
                result.add(temp);
            } else {
                result.add(0);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("ab");
        stringList.add("ab");
        stringList.add("abc");
        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        List<Integer> actual = matchingStrings(stringList, queries);
        Assert.assertEquals(actual, Arrays.asList(2, 1, 0));
    }

}
