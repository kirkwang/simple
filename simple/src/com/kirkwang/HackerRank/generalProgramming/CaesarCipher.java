/*
 * 4/26/19 10:36 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;


public class CaesarCipher {

    static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                int x = 0;
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
        String beabeefeab = "Jyabeefeab";
        int shift = 3;
        String ml = caesarCipher(beabeefeab, shift);
        System.out.println(ml);
    }

}
