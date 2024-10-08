package com.leetcode.easy;

import org.testng.Assert;

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lw = new LengthOfLastWord();

        Assert.assertEquals(lw.lengthOfLastWord("   fly me   to   the moon  "), 4);
        Assert.assertEquals(lw.lengthOfLastWord("luffy is still joyboy"), 6);
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String[] sp = s.trim().split(" ");
        return sp[sp.length - 1].length();
    }
}
