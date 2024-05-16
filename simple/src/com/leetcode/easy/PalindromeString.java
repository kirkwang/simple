package com.leetcode.easy;

/**
 * Created by kewang on 12/27/15.
 */

/**
 *
 * https://leetcode.com/problems/valid-palindrome/
  Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 **/
public class PalindromeString {

    public static void main(String[] args) {
        String trimedInput = "amanaplanacanalpanama";

        String source = "A man, a plan, a canal: Panama";

        System.out.println(PalindromeString.palindromeString(source));
    }

    public static boolean palindromeString(String s) {
        if (s == null) {
            return false;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}