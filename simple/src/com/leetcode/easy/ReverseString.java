package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/reverse-string/description/
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] target;
        target = "hello".toCharArray();
        reverseString(target);
        Assert.assertEquals(target, "olleh".toCharArray());

        target = "Hannah".toCharArray();
        reverseString(target);
        Assert.assertEquals(target, "hannaH".toCharArray());
    }

}



