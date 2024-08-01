package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/repeated-substring-pattern/
Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern2(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        int secondHalf = s.length() / 2;
        for (int i = 0; secondHalf < s.length(); i++) {
            if (s.charAt(i) != s.charAt(secondHalf++)) {
                return false;
            }

        }
        return true;
    }

    public static boolean repeatedSubstringPattern(String s) {

        int len = s.length();
        for (int i = len / 2; i > 1; i--) {
            if (len % i == 0) {  //check if it is even for 3%1 or 4%2
                int numberOfRepeat = len / i;
                String subString = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < numberOfRepeat; j++) {
                    sb.append(subString);
                }
                if (sb.toString().equals(s)) return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        Assert.assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern("abababab"));
        Assert.assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern("aba"));

        Assert.assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern2("aba"));
        Assert.assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern2("abab"));
        Assert.assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern2("abababab"));
        Assert.assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern2("ab"));
        Assert.assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern2("ababab"));
    }
}
