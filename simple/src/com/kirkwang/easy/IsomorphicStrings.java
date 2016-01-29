package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/28/15.
 */
/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        // boolean istr = ;
        System.out.print(IsomorphicStrings.isomorphicStrings("daa", "add"));
    }

    public static boolean isomorphicStrings(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map1 = new HashMap<Character, Character>();
        Map<Character, Character> map2 = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                if (map1.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            if (map2.containsKey(t.charAt(i))) {
                if (map2.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
