package com.leetcode;

import java.util.Objects;
/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 */
public class StrStr {
    public static void main(String[] args) {
        StrStr ss = new StrStr();
        String haystack = "hello"; //leetcode , sadbutsad ,hello,a
        String needle = "ll"; //leeto , sad , ll,a
        ss.strStr(haystack, needle);
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
