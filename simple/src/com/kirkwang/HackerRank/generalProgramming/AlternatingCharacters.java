/*
 * 4/25/19 9:06 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        String[] inputArray = new String[myInt];
        for (int i = 0; i < myInt; i++) {
            inputArray[i] = scanner.next();
        }
        scanner.close();

        int[] result = alternatingCharacters(inputArray);
        for (int j : result) {
            System.out.println(j);
        }
    }

    static int[] alternatingCharacters(String[] s) {
        int deletCount = 0;
        int[] result = new int[s.length];
        for (int j = 0; j < s.length; j++) {
            for (int i = 1; i < s[j].length(); i++) {
                if (s[j].charAt(i - 1) == s[j].charAt(i)) {
                    deletCount++;
                }
            }
            result[j] = deletCount;
            deletCount = 0;
        }

        return result;
    }

}
