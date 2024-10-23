/*
 * 4/25/19 10:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/camelcase/problem
 */
public class CamelCase {
    public static void main(String[] args) {

        Assert.assertEquals(camelcase("saveChangesInTheEditor"), 5);
    }

    static int camelcaseJ8(String a) {

        return (int) a.chars().filter(Character::isUpperCase).count();
    }

    public static int camelcase(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                counter++;
            }
        }
        return counter;
    }
}
