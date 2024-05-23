package com.leetcode.easy;

import org.testng.Assert;

/**
 * Created by amp on 9/24/2015.
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/">...</a>
 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * <p>
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * <p>
 * Example 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseString {
    public static char[] reverseString(char[] s) {
       /*
       Input: s = ["h","e","l","l","o"]
       Output: ["o","l","l","e","h"]
        */
        if (s == null) {
            return s;
        }
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        return s;
    }
    public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String noSpaces = s.trim().replaceAll("\\s+", ":");
        String[] reversed = noSpaces.split(":");


        for (int i = 0; i < reversed.length / 2; i++) {
            String temp = reversed[i];
            reversed[i] = reversed[reversed.length - i - 1];
            reversed[reversed.length - i - 1] = temp;
        }

        return String.join(" ", reversed);
    }


    public static void main(String[] args) {


        String str = "a good   example";
        Assert.assertEquals(reverseWords(str), "example good a");

        Assert.assertEquals(reverseString("hello".toCharArray()), "olleh".toCharArray());
    }

}



