package com.kirkwang.HackerRank.generalProgramming;


import org.testng.Assert;

import java.util.*;

/* Traverse the string just 1 time. Save the weights of every possible uniform substring in a HashSet.
https://www.hackerrank.com/challenges/weighted-uniform-string/problem
  Time complexity: O(n)
// Space complexity: O(n)
*/
public class WeightedUniformStrings {
    public static void main(String[] args) {


        List<Integer> querysList = new ArrayList<>();
        querysList.add(9);
        querysList.add(7);
        querysList.add(8);
        querysList.add(12);
        querysList.add(5);

        List<String> results = weightedUniformStrings("aaabbbbcccddd", querysList);

        String[] expectedArray = {"Yes", "No", "Yes", "Yes", "No"};
        List<String> expected = new ArrayList<>(Arrays.asList(expectedArray));

        Assert.assertEquals(results, expected);

    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {

        Set<Integer> weights = getWeights(s);
        List<String> results = new ArrayList<>();
        for (Integer query : queries) {
            results.add(weights.contains(query) ? "Yes" : "No");
            System.out.println(weights.contains(query) ? "Yes" : "No");
        }
        return results;
    }

    private static Set<Integer> getWeights(String str) {
        Set<Integer> weights = new HashSet<>();
        int weight = 0;
        char prev = ' '; // so it doesn't match 1st character
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr != prev) {
                weight = 0;
            }
            weight += curr - 'a' + 1;
            weights.add(weight);
            prev = curr;
        }
        return weights;
    }
}
