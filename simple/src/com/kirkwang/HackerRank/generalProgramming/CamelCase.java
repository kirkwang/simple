/*
 * 4/25/19 10:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class CamelCase {
    public static void main(String[] args) {

        String a = "saveChangesInTheEditor";
        System.out.println(camelcaseJ8(a));
    }

    static int camelcase(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                wordCount++;
            }
        }
        return wordCount;
    }

    static int camelcaseJ8(String a) {

        int count = (int) a.chars().filter(Character::isUpperCase).count();
        return count;
    }
}
