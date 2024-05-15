package com.leetcode;

import java.util.Objects;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class StrStr {
    public static void main(String[] args) {
        StrStr ss = new StrStr();
        String haystack = "hello"; //leetcode , sadbutsad ,hello,a
        String needle = "ll"; //leeto , sad , ll,a
        System.out.println(ss.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
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
}
