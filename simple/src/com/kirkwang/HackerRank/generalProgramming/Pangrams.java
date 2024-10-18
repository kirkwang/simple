/*
 * 4/26/19 4:34 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/*
https://www.hackerrank.com/challenges/pangrams/problem
 */
public class Pangrams {

    public static void main(String[] args) {


        Assert.assertEquals(pangrams("We promptly judged antique ivory buckles for the next prize"), "pangram");
        Assert.assertEquals(pangrams("We promptly judged antique ivory buckles for the prize"), "not pangram");
    }

    static String pangrams(String s) {
        if (s.isEmpty() || s.length() < 26) {
            return "not pangram";
        }
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        return set.size() == 26 ? "pangram" : "not pangram";
    }

}
