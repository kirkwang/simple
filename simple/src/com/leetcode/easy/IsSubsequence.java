package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/is-subsequence/description/
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int source = 0;
        int target = 0;

        while (target < t.length()) {

            if (s.charAt(source) == t.charAt(target)) {
                source++;
            }
            target++;
            if (source == s.length()) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String t = "ahbgdc";
        Assert.assertTrue(IsSubsequence.isSubsequence("abc", t));
        Assert.assertFalse(IsSubsequence.isSubsequence("aec", t));
        Assert.assertFalse(IsSubsequence.isSubsequence("axc", t));

    }

}
