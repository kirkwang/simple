package com.kirkwang.HackerRank.generalProgramming;// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.HashSet;

// Traverse the string just 1 time. Save the weights of every possible uniform substring in a HashSet.

//  Time complexity: O(n)
// Space complexity: O(n)

public class WeightedUniformStrings {
    public static void main(String[] args) {
        String str = "aaabbbbcccddd";
        int[] querys = {9, 7, 8, 12, 5};
        HashSet<Integer> weights = getWeights(str);
        for (int i = 0; i < querys.length; i++) {
            System.out.println(weights.contains(querys[i]) ? "Yes" : "No");
        }
    }

    private static HashSet<Integer> getWeights(String str) {
        HashSet<Integer> weights = new HashSet<>();
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
