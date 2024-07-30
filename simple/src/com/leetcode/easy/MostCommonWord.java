package com.leetcode.easy;

import org.testng.Assert;

import java.util.*;

/*
https://leetcode.com/problems/most-common-word/
Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation:
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"),
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a"

 */
public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.isEmpty()) {
            return "";
        }
        HashMap<String, Integer> mMap = getStringIntegerHashMap(paragraph);
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(banned));

        int freq = 0;
        String ans = "";
        for (Map.Entry<String, Integer> entry : mMap.entrySet()) {
            if (!entry.getKey().isEmpty() && entry.getValue() > freq && !ts.contains(entry.getKey())) {
                freq = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;

    }

    private static HashMap<String, Integer> getStringIntegerHashMap(String paragraph) {
        String[] commaFiltered = paragraph.trim().split(",");

        List<String> list = new ArrayList<>();
        for (String string : commaFiltered) {
            String[] temp = string.split(" ");
            for (String s : temp) {
                list.add(s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
            }
        }

        HashMap<String, Integer> mMap = new HashMap<>();
        for (String string : list) {
            mMap.put(string, mMap.getOrDefault(string, 0) + 1);
        }
        return mMap;
    }

    public static void main(String[] args) {

        String result;
        result = mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
        Assert.assertEquals(result, "ball");

        result = mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"});
        Assert.assertEquals(result, "b");

    }
}
