package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/word-pattern/description/">...</a>
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 */
public class WordPattern {
    public static void main(String[] args) {

        Assert.assertTrue(wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(wordPattern("abba", "dog cat cat fish"));

    }

    public static boolean wordPattern(String pattern, String s) {

        String[] split = s.trim().split(" ");
        if (split.length != pattern.length()) {
            return false;
        }
        HashMap<String, Integer> m = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {

            if (!Objects.equals(m.put(split[i], i), m.put(String.valueOf(pattern.charAt(i)), i))) {
                return false;
            }
        }
        return true;
    }

}
