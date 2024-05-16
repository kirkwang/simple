package com.leetcode.easy;

/**
 * Created by amp on 9/24/2015.
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/">...</a>
 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 *
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 *
 * Example 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseString {

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

        //original string
        String str = "a good   example";
        System.out.println("Original String: " + str);

        System.out.println("Reversed stance: " + reverseWords(str));


    }

}



