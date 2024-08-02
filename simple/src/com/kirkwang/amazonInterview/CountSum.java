/*
 * 4/5/19 12:17 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

import org.testng.Assert;

import java.util.ArrayList;

public class CountSum {

    public static int countSum(String input) {
        StringBuilder strDigi = new StringBuilder();

        int index = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                strDigi.append(c);
            } else {
                list.add(index++, strDigi.toString());
                strDigi = new StringBuilder();
            }
        }
        list.add(index, strDigi.toString());
        int sum = 0;
        for (String s : list) {
            if (!s.isEmpty()) {
                sum = sum + Integer.parseInt(s);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Assert.assertEquals(countSum("85M2A23++46"), 156);
    }
}
