/*
 * 4/26/19 3:04 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

/*
https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 */
public class HackerRankinaString {

    public static void main(String[] args) {
        String target = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String shift = HackerRankinaString.hackerrankInString(target);
        System.out.println(shift);
    }

    public static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int index = 0;

        if (s.isEmpty() || s.length() < hackerrank.length()) {
            return "NO";
        }
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
