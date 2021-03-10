package com.kirkwang.Codility;

import java.util.concurrent.TimeUnit;

/**
 * Created by kewang on 11/17/17.
 */
public class String2Minutes {


    public static int String2Minutes(String time) {
        String[] split = time.split(":");
        long minutes = 0;
        if (split.length == 2) {
            minutes = TimeUnit.HOURS.toMinutes(Integer.parseInt(split[0])) +
                    Integer.parseInt(split[1]);
            System.out.println(minutes);
        }
        return (int) minutes;
    }

    public static int String2Min(String time) {
        String[] sp = time.split(":");
        if (sp.length > 2) return -1;
        int hours = Integer.parseInt(sp[0]) * 60;

        return hours + Integer.parseInt(sp[1]);
    }

    public static void main(String[] args) {


        System.out.println(String2Min("00:21"));
    }

}
