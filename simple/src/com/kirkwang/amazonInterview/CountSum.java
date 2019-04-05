/*
 * 4/5/19 12:17 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

public class CountSum {

    public static int countSum(String input) {
        String strDigi = "";
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (Character.isDigit(c)) {
                strDigi = strDigi + c;
            } else {
                if (!strDigi.equals("")) {
                    sum = sum + Integer.valueOf(strDigi);
                    strDigi = "";
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "85M2A23++46";
        int sum = new CountSum().countSum(s);
        System.out.println(sum);
    }
}
