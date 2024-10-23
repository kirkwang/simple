/*
 * 4/26/19 10:36 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;
/*https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 *
 * */

import java.util.Scanner;

public class CaesarCipher {

    static String caesarCipher(char[] s, int k) {
        StringBuilder result = new StringBuilder();

        for (char c : s) {
            if (Character.isUpperCase(c)) {
                int x;
                if (c > ('Z' - k)) {
                    x = (c - 'A' + k) % 26;
                    x = x + 'A';
                } else {
                    x = c + k;
                }
                result.append((char) x);
            } else if (Character.isLowerCase(c)) {
                char ch = (char) ((c - 'a' + k) % 26 + 'a');

                result.append(ch);
            } else {

                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // String beabeefeab = "middle-Outz";  //okffng-Qwvb
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        char[] input = scanner.next().toCharArray();
        int shift = scanner.nextInt();
        scanner.close();

        System.out.println(caesarCipher(input, shift));
    }

}
