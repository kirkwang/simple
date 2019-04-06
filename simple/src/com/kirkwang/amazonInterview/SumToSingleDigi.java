/*
 * 4/5/19 9:45 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

public class SumToSingleDigi {
    public static int sunToSingleDigi(int input) {
        int result = input;
        while (result >= 10) {

            int reminder = result % 10;
            int decemial = result / 10;
            result = reminder + decemial;

        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 67, 28, 0, -1, -30, -20};
        int result = SumToSingleDigi.sunToSingleDigi(27);

        System.out.println(result);
    }
}
