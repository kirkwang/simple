package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/is-subsequence/description/
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

 */
public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int s_pointer = 0;
        int t_pointer = 0;

        while (t_pointer < t.length()) {

            if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                s_pointer++;
            }
            if (s_pointer == s.length()) {
                return true;
            }
            t_pointer++;
        }
        return false;

    }

    public static void main(String[] args) {

        Assert.assertTrue(Is_Subsequence.isSubsequence("abc", "ahbgdc"));
        Assert.assertFalse(Is_Subsequence.isSubsequence("axc", "ahbgdc"));

    }

}
