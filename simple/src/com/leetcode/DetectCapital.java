/*
 * 5/1/19 12:59 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

/*
https://leetcode.com/problems/detect-capital/submissions/
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right
 */
public class DetectCapital {
    public static void main(String[] args) {

        String s = "Google";
        String s1 = "FlaG";

        boolean result = detectCapitalUse(s1);
        System.out.println(result);
    }

    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || Character.isUpperCase(word.charAt(0)) && isLowerCase(word.substring(1));
    }

    public static boolean isLowerCase(String s) {

        return s.equals(s.toLowerCase());

    }
}
