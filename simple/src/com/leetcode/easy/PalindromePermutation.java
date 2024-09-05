package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/27/15.
 */
/*
https://leetcode.ca/all/266.html
Given a string, determine if a permutation of the string could form a palindrome.
For example,
"code" -> False, "aab" -> True, "carerac" -> True.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        PalindromePermutation pp = new PalindromePermutation();

        Assert.assertFalse(pp.palindromePermutation("abcdddabcabcda"));
        Assert.assertTrue(pp.palindromePermutation("carerac"));
        Assert.assertFalse(pp.palindromePermutation("code"));
        Assert.assertTrue(pp.palindromePermutation("aab"));
    }

    public boolean palindromePermutation(String source) {
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < source.length(); i++) {
            Character c = source.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);

        }
        int count = 0;
        for (int i : hm.values()) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count <= 1;

    }
}
