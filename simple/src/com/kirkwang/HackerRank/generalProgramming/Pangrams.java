/*
 * 4/26/19 4:34 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.HashSet;

/*
https://www.hackerrank.com/challenges/pangrams/problem
 */
public class Pangrams {

    public static void main(String[] args) {
        String pangram = "We promptly judged antique ivory buckles for the next prize";

        System.out.println(pangrams(pangram));
    }

    static String pangrams(String s) {
        if (s.isEmpty()) {
            return "not pangram";
        }
        s = s.toLowerCase();

        HashSet<Character> sSet = new HashSet<>();

        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sSet.add(c);
            }
        }

        return sSet.size() == 26 ? "pangram" : "not pangram";
    }
}
