/*
 * 4/5/19 12:17 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

import java.util.ArrayList;

public class CountSum {

    public static int countSum(String input) {
        String strDigi = "";
        int sum = 0;
        int index = 0;
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (Character.isDigit(c)) {
                strDigi = strDigi + c;
            } else {

                list.add(index++, strDigi);
                strDigi = "";
            }
        }
        list.add(index, strDigi);
        for (String s : list) {
            if (!s.equals("")) {
                sum = sum + Integer.valueOf(s);
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
