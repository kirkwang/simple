package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/28/15.
 */
/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

    public static void main(String[] args) {

        System.out.print(IsomorphicStrings.isomorphicStrings("daa", "add"));
    }

    public static boolean isomorphicStrings(String source, String target) {
        if (source.length() != target.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<Character, Character>(); //daa, add
        Map<Character, Character> map2 = new HashMap<Character, Character>(); //add, daa

        for (int i = 0; i < source.length(); i++) {
            if (map1.containsKey(source.charAt(i))) {
                if (map1.get(source.charAt(i)) != target.charAt(i)) {
                    return false;
                }
            }
            if (map2.containsKey(target.charAt(i))) {
                if (map2.get(target.charAt(i)) != source.charAt(i)) {
                    return false;
                }
            }
            map1.put(source.charAt(i), target.charAt(i));
            map2.put(target.charAt(i), source.charAt(i));
        }
        return true;
    }
}
