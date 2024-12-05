package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

public class TimeConversion {
    public static String timeConversion(String s) {
        String ap = s.substring(s.length() - 2);
        String[] time = s.substring(0, s.length() - 2).split(":");

        if (ap.equals("PM")) {
            if (Integer.parseInt(time[0]) < 12) {
                int formated = Integer.parseInt(time[0]) + 12;
                time[0] = String.valueOf(formated);
            }
        } else {
            if (Integer.parseInt(time[0]) == 12) {
                time[0] = "00";
            }
        }

        return String.join(":", time);
    }

    public static void main(String... args) {
        String actual = timeConversion("07:05:45PM");
        Assert.assertEquals(actual, "19:05:45");

        actual = timeConversion("12:01:45PM");
        Assert.assertEquals(actual, "12:01:45");

        actual = timeConversion("12:01:45AM");
        Assert.assertEquals(actual, "00:01:45");
    }
}
