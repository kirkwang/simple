package com.leetcode.easy;

/**
 * Created by kewang on 12/25/15.
 */
/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.


Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
*/
@SuppressWarnings("Array")
public class RotateString {

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        boolean result = RotateString.intermediaArray(s, goal);
        System.out.println("intermediaArray " + result);
    }

    public static boolean intermediaArray(String s, String goal) {

        if (s.isEmpty() || s.length() != goal.length()) {
            return false;
        }
        char[] result = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            rotate(result, s.length());
            if (goal.equals(new String(result))) {
                return true;
            }
        }
        return false;
    }

    private static void rotate(char[] s, int length) {
        char t = s[0];

        for (int i = 0; i < length - 1; i++) {
            s[i] = s[i + 1];
        }
        s[length - 1] = t;
    }


}
