package com.kirkwang.HackerRank.generalProgramming;


import java.util.HashSet;
import java.util.Set;

/* Traverse the string just 1 time. Save the weights of every possible uniform substring in a HashSet.
https://www.hackerrank.com/challenges/weighted-uniform-string/problem
  Time complexity: O(n)
// Space complexity: O(n)
*/
public class WeightedUniformStrings {
    public static void main(String[] args) {
        String str = "aaabbbbcccddd";
        int[] querys = {9, 7, 8, 12, 5};
        Set<Integer> weights = getWeights(str);
        for (int query : querys) {
            System.out.println(weights.contains(query) ? "Yes" : "No");
        }
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
