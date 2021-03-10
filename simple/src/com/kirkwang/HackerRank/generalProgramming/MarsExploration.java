/*
 * 4/26/19 2:19 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.stream.IntStream;

public class MarsExploration {

    static int marsExploration(String s) {
        int result = 0;
        for (int i = 0, j = i + 3; j <= s.length(); ) {
            result = result + countSos(s.substring(i, j));
            i = i + 3;
            j = j + 3;
        }
        return result;
    }

    static int countSos(String input) {

        String UNIT = "SOS";
        String part = input;
        return (int) IntStream.range(0, 3).filter(i -> input.charAt(i) != UNIT.charAt(i)).count();
    }

    public static void main(String[] args) {
        String beabeefeab = "SOSSPSSQSSOR";
        int shift = 3;
        shift = marsExploration(beabeefeab);
        System.out.println(shift);
    }
}
