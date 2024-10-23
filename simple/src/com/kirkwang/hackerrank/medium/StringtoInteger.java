/*
 * 5/7/19 4:28 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.medium;

/*
https://www.hackerrank.com/contests/doyoulikeit/challenges/string-to-integer-atoi
 */
public class StringtoInteger {
    public static int StringtoInteger(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }
        int result = 0;
        boolean neg = false;
        String numberOnly = input.trim().replaceAll("[^0-9-+]", "");
        for (int i = 0; i < numberOnly.length(); i++) {
            char c = numberOnly.charAt(i);
            if (Character.isDigit(c)) {
                int nValue = Character.getNumericValue(c);
                result = nValue + result * 10;
            } else {
                neg = true;
            }
        }
        return neg ? Integer.parseInt("-" + result) : result;
    }

    public static void main(String[] args) {

        String input = "-2342";

        System.out.println(StringtoInteger.StringtoInteger(input));
    }
}
