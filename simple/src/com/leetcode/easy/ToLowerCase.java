package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/to-lower-case/
Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"

 */
public class ToLowerCase {
    public static void main(String[] args) {

        Assert.assertEquals(toLowerCase("Hello"), "hello");
        Assert.assertEquals(toLowerCase("here"), "here");
        Assert.assertEquals(toLowerCase("LOVELY"), "lovely");
    }

    public static String toLowerCase(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }
}
