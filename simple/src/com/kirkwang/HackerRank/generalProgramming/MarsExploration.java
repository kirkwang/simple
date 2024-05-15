/*
 * 4/26/19 2:19 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

/*
https://www.hackerrank.com/challenges/mars-exploration/problem
 */
public class MarsExploration {

    static int marsExploration(String s) {
        int result = 0;
        for (int i = 0, j = i + 3; j <= s.length(); ) {
            result = result + countSos(s.substring(i, j));
            i += 3;
            j += 3;
        }
        return result;
    }

    static int countSos(String input) {

        String UNIT = "SOS";
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != UNIT.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String beabeefeab = "SOSSPSSQSSOR";
        System.out.println(marsExploration(beabeefeab));
    }
}
