/*
 * 4/27/19 1:21 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class FunnyString {

    public static void main(String[] args) {

        String input = "acxz";
        String input1 = "bcxz";

        System.out.println(funnyString(input1));
    }

    static String funnyString(String s) {
        boolean flag = true;

        for (int i = 1, j = s.length() - 2; i <= j; i++, j--) {
            if (Math.abs(s.charAt(i - 1) - s.charAt(i)) != Math.abs(s.charAt(j + 1) - s.charAt(j))) {
                flag = false;
                break;
            }
        }

        return flag ? "Funny" : "Not Funny";
    }
}
