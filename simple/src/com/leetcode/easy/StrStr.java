package com.leetcode.easy;

import org.testng.Assert;

import java.util.Objects;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

 */
public class StrStr {
    public static void main(String[] args) {

        Assert.assertEquals(strStr("sadbutsad", "sad"), 0);
        Assert.assertEquals(strStr("leetcode", "leeto"), -1);
        Assert.assertEquals(strStr("hello", "ll"), 2);

        Assert.assertEquals(str("sadbutsad", "sad"), 0);
        Assert.assertEquals(str("leetcode", "leeto"), -1);
        Assert.assertEquals(str("hello", "ll"), 2);
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int end = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (end <= haystack.length() - 1) {
                end = i + needle.length();
                String target = haystack.substring(i, end);
                if (Objects.equals(needle, target)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int str(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
