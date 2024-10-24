package com.leetcode.easy;
/*
https://leetcode.com/problems/find-words-containing-character/
Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
Example 3:

Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 */

import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsContaining {
    public static void main(String[] args) {
        List<Integer> result;
        SoftAssert softAssert = new SoftAssert();
        result = findWordsContaining(new String[]{"leet", "code"}, 'e');
        softAssert.assertTrue(Arrays.equals(result.toArray(), new Integer[]{0, 1}), "expect {0, 1}");

        result = findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a');
        softAssert.assertTrue(Arrays.equals(result.toArray(), new Integer[]{0, 2}), "expect {0, 2}");

        result = findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z');
        softAssert.assertTrue(Arrays.equals(result.toArray(), new Integer[]{}), "expect {abc, bcd,aaaa, cbc}");

        result = findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a');
        softAssert.assertTrue(Arrays.equals(result.toArray(), new Integer[]{0, 2}), "expect {0, 2}");
        softAssert.assertAll();
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }
        return list;
    }
}
