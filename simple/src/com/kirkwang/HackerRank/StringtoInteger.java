/*
 * 5/7/19 4:28 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

public class StringtoInteger {
    public static void StringtoInteger(String input) {
        Integer result = null;
        try {
            result = Integer.parseInt(input);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {

        String input = "2342";
        input = "adf";
        StringtoInteger.StringtoInteger(input);
    }
}
