/*
 * 4/26/19 4:34 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        String pangram = "We promptly judged antique ivory buckles for the next prize";

        String shift = pangrams(pangram);
        System.out.println(shift);
    }

    static String pangrams(String s) {

        s = s.toLowerCase();

        Set sSet = new HashSet<Character>();

        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sSet.add(c);
            }
        }

        return sSet.size() == 26 ? "pangram" : "not pangram";
    }
}
