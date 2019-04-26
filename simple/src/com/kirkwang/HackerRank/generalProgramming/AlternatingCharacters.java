/*
 * 4/25/19 9:06 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class AlternatingCharacters {
    public static void main(String[] args) {
        String a = "AAABBB";
        String AAAA = "AAAA";


        System.out.println(alternatingCharacters(AAAA));
    }

    static int alternatingCharacters(String s) {
        int deletCount = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                deletCount++;
            }
        }
        return deletCount;
    }

}
