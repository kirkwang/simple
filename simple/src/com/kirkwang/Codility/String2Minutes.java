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


  public static void main(String[] args) {

    int[] n = new int[]{1, 0, 0, 1, 0, 0}; //5, 4, 3, 2, 1
    //  '10:00', '13:21'

    System.out.println(String2Minutes("1:21"));
  }

}
