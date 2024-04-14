package com.kirkwang.easy;

/**
 * Created by kewang on 12/27/15.
 */
/*
  Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
   */
public class PalindromeString {

    public static void main(String[] args) {
        String trimedInput = "amanaplanacanalpanama";

        String source = "A man, a plan, a canal: Panama";
        source = source.replaceAll("[^a-zA-Z0-9]]", "").toLowerCase();
        System.out.println(PalindromeString.palindromeString(source));
    }

    public static boolean palindromeString(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}