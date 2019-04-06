package com.kirkwang.amazonInterview;/*
 * 4/5/19 1:57 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

import java.util.Arrays;

public class ConvertFloatToMin {
    public static String convertFloatToMin(String input) {

        String[] dotSplit = input.split("\\.");
        char[] beforDot = dotSplit[0].toCharArray();
        char[] afterDot = dotSplit[1].toCharArray();

        Arrays.sort(beforDot);
        Arrays.sort(afterDot);
        String beforeDot = String.valueOf(beforDot);
        int zeros = beforDot.length - beforeDot.length();
        int firstDig = Integer.parseInt(beforeDot);

        for (int i = 0; i < zeros; i++) {
            firstDig = firstDig * 10;
        }
        beforeDot = firstDig + beforeDot.substring(1);
        return beforeDot + "." + String.valueOf(afterDot);
    }

    public static void main(String[] args) {
        String s = "3120.434";
        String result = ConvertFloatToMin.convertFloatToMin(s);
        System.out.println(result);
    }
}