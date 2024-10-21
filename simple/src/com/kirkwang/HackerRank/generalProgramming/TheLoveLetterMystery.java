/*
 * 4/27/19 8:18 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
 */
public class TheLoveLetterMystery {
    public static void main(String[] args) {

        Assert.assertEquals(theLoveLetterMystery("abc"), 2);
        Assert.assertEquals(theLoveLetterMystery("abcba"), 0);
        Assert.assertEquals(theLoveLetterMystery("abcd"), 4);
        Assert.assertEquals(theLoveLetterMystery("cba"), 2);
    }

    static int theLoveLetterMystery(String s) {
        int result = 0;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; ) {
            result += Math.abs(s.charAt(i++) - s.charAt(j--));
        }
        return result;
    }
}
