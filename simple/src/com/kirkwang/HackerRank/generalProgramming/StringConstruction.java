/*
 * 4/28/19 2:02 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/*
    https://www.hackerrank.com/challenges/string-construction/problem
 */
public class StringConstruction {

    public static void main(String[] args) {

        Assert.assertEquals(stringConstruction("abab"), 2);
        Assert.assertEquals(stringConstruction("abcd"), 4);
    }

    static int stringConstruction(String s) {

        Set<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
