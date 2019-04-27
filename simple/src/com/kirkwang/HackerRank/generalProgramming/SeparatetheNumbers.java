/*
 * 4/26/19 9:08 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class SeparatetheNumbers {
    public static void main(String[] args) {

        String s = "91011";
        String s1 = "101112";

        long result = solve(s1);
        System.out.println(result > 0 ? "YES " + result : "NO");

    }

    static long solve(String s) {
        if (s.charAt(0) == '0') {
            return -1;
        }
        for (int length = 1; length * 2 <= s.length(); length++) {
            long firstNumber = Long.parseLong(s.substring(0, length));

            StringBuilder sequence = new StringBuilder();
            long number = firstNumber;
            while (sequence.length() < s.length()) {
                sequence.append(number);
                number++;
            }
            if (sequence.toString().equals(s)) {
                return firstNumber;
            }
        }
        return -1;
    }
}
