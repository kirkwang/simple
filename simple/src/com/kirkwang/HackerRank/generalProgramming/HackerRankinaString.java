/*
 * 4/26/19 3:04 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class HackerRankinaString {

    public static void main(String[] args) {
        String hereiamstackerrank = "hereiamstackerrank";
        String shift = hackerrankInString(hereiamstackerrank);
        System.out.println(shift);
    }

    static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int indexOfHacker = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hackerrank.charAt(indexOfHacker)) {
                indexOfHacker++;
            }
            if (indexOfHacker == hackerrank.length()) {
                return "YES";
            }
        }

        return "NO";
    }
}
