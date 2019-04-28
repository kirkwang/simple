/*
 * 4/27/19 8:18 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class TheLoveLetterMystery {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcba";

        System.out.println(theLoveLetterMystery(s1));
    }

    static int theLoveLetterMystery(String s) {
        int result = 0;
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            result += Math.abs(s.charAt(i) - s.charAt(j));
        }
        return result;
    }
}
