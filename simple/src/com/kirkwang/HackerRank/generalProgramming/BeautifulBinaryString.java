/*
 * 4/27/19 8:00 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://www.hackerrank.com/challenges/beautiful-binary-string/problem
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.Scanner;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        // String input = "0100101010";

        Scanner scanner = new Scanner(System.in);
        int sLength = scanner.nextInt();
        char[] input;
        input = scanner.next().toCharArray();
        scanner.close();
        System.out.println(beautifulBinaryString(input));
    }

    static int beautifulBinaryString(char[] sb) {

        int count = 0;
        for (int i = 2; i < sb.length; i++) {
            if (sb[i - 2] == '0' && sb[i - 1] == '1' && sb[i] == '0') {
                sb[i] = '1';
                count++;
            }
        }
        return count;
    }
}
