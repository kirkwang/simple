/*
 * 4/26/19 3:04 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 */
public class HackerRankingString {

    public static void main(String[] args) {

        Assert.assertEquals(HackerRankingString.hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"), "NO");
        Assert.assertEquals(HackerRankingString.hackerrankInString("hackerworld"), "NO");
        Assert.assertEquals(HackerRankingString.hackerrankInString("hereiamstackerrank"), "YES");
    }

    public static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hackerrank.charAt(index) == s.charAt(i)) {
                index++;
            }
            if (index == hackerrank.length()) {
                return "YES";
            }
        }
        return "NO";
    }

}
