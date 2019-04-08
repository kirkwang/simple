/*
 * 4/5/19 9:45 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

public class SumToSingleDigi {
    public static int sunToSingleDigi(int input) {

        while (input >= 10) {
            int reminder = input % 10;
            int decemial = input / 10;
            input = reminder + decemial;
        }

        return input;
    }

    public static void main(String[] args) {
        int result = SumToSingleDigi.sunToSingleDigi(271);

        System.out.println(result);
    }
}
