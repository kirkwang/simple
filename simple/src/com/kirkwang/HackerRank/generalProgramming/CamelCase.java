/*
 * 4/25/19 10:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/camelcase/problem
 */
public class CamelCase {
    public static void main(String[] args) {
        //String a = "saveChangesInTheEditor";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(camelcase(input));
    }

    static int camelcase(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                wordCount++;
            }
        }
        return wordCount;
    }

    static int camelcaseJ8(String a) {

        return (int) a.chars().filter(Character::isUpperCase).count();
    }
}
