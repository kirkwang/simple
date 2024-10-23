/*
 * 4/25/19 10:38 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/strong-password/problem
 */
public class StrongPassword {


    public static void main(String[] args) {

        Assert.assertEquals(minimumNumber(6, "#HackerRank"), 1);
        Assert.assertEquals(minimumNumber(6, "Ab1"), 3);
        Assert.assertEquals(minimumNumber(6, "A"), 5);
    }

    static int minimumNumber(int n, String password) {
        String special_characters = "!@#$%^&*()-+";
        int counter = 0;
        if (password.chars().noneMatch(Character::isDigit)) {
            counter++;
        }
        if (password.chars().noneMatch(Character::isLowerCase)) {
            counter++;
        }
        if (password.chars().noneMatch(Character::isUpperCase)) {
            counter++;
        }
        if (password.chars().noneMatch(ch -> special_characters.indexOf(ch) >= 0)) {
            counter++;
        }
        return Math.max(counter, 6 - password.length());

    }

}
