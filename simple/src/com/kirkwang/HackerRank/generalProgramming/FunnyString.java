/*
 * 4/27/19 1:21 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/funny-string/problem
 */
public class FunnyString {

    public static void main(String[] args) {

        Assert.assertEquals(funnyString("acxz"), "Funny");
        Assert.assertEquals(funnyString("bcxz"), "Not Funny");

    }

    public static String funnyString(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            char s1 = s.charAt(i + 1);
            char s2 = s.charAt(i);
            char r1 = s.charAt(s.length() - 2 - i);
            char r2 = s.charAt(s.length() - 1 - i);

            if (Math.abs(s1 - s2) != Math.abs(r1 - r2)) {
                return "Not Funny";
            }
        }
        return "Funny";
    }


}
