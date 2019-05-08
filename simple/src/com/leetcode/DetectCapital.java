/*
 * 5/1/19 12:59 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

/*
https://leetcode.com/problems/detect-capital/submissions/
 */
public class DetectCapital {
    public static void main(String[] args) {

        String s = "Google";
        String s1 = "FlaG";


        boolean result = detectCapitalUse(s1);
        System.out.println(result);

    }

    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || isLowerCase(word.substring(1)) && Character.isUpperCase(word.charAt(0));
    }

    public static boolean isLowerCase(String s) {

        return s.equals(s.toLowerCase());

    }
}
