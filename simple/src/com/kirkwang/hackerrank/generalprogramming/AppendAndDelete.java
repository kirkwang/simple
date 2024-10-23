/*
 * 4/23/19 3:17 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/append-and-delete/problem
Function Description

Complete the appendAndDelete function in the editor below. It should return a string, either Yes or No.

appendAndDelete has the following parameter(s):

s: the initial string
t: the desired string
k: an integer that represents the number of operations
 */
public class AppendAndDelete {

    public static void main(String[] args) {
        Assert.assertEquals(appendAndDelete("hackerhappy", "hackerrank", 9), "Yes");
        Assert.assertEquals(appendAndDelete("aba", "aba", 7), "Yes");
        Assert.assertEquals(appendAndDelete("ashley", "ash", 2), "No");

    }

    public static String appendAndDelete(String s, String t, int k) {

        if (s.length() + t.length() <= k) {
            return "Yes";
        }
        int i;
        for (i = 0; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int sCount = s.length() - i;
        int tCount = t.length() - i;
        boolean flag = sCount + tCount <= k && (k - (sCount + tCount)) % 2 == 0;
        return flag ? "Yes" : "No";
    }

    public static String append_and_Delete(String s, String t, int k) {
        /* Case 1 */
        if (s.length() + t.length() <= k) {
            return "Yes";
        }

        /* Case 2 */
        int i = 0; // represents index of 1st non-matching character
        for (; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int minOperations = (s.length() - i) + (t.length() - i);
        boolean flag = k >= minOperations && (k - minOperations) % 2 == 0;
        return flag ? "Yes" : "No";
    }
}