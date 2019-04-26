/*
 * 4/25/19 10:38 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class StrongPassword {
    final static String special_characters = "!@#$%^&*()-+";

    public static void main(String[] args) {

        String a = "#HackerRank";
        int length = 6;
        System.out.println(minimumNumber(length, a));
    }

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int addNum = 0;
        if (!password.chars().anyMatch(Character::isDigit)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isLowerCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(ch -> special_characters.indexOf(ch) >= 0)) {
            addNum++;
        }

        return Math.max(addNum, 6 - password.length());
    }
}
