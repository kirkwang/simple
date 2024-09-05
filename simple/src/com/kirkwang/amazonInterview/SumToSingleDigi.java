/*
 * 4/5/19 9:45 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

import org.testng.Assert;

public class SumToSingleDigi {
    public static int sunToSingleDigi(int input) {

        while (input >= 10) {
            input = (input % 10) + (input / 10);
        }
        return input;
    }

    public static void main(String[] args) {
        int result = SumToSingleDigi.sunToSingleDigi(271);
        Assert.assertEquals(result, 1);

        Assert.assertEquals(SumToSingleDigi.sunToSingleDigi(333), 9);
    }
}
