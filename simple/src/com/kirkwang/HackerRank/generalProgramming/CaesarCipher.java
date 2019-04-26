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

                char newChar = (char) ((c + k));
                result.append(newChar);
            } else if (Character.isLowerCase(c)) {
                char newChar = (char) ((c + k));
                result.append(newChar);
            } else {

                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String beabeefeab = "Aeabeefeab";
        int shift = 3;
        String ml = caesarCipher(beabeefeab, shift);
        System.out.println(ml);
    }

}
