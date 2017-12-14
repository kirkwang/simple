package com.kirkwang.easy;

/**
 * Created by kewang on 12/13/17.
 */

@Deprecated
public class ReverseInteger {

  public static int ReverseInteger(int input) {
    int result = 0;
    while (input > 0) {
      int reminder = input % 10;
      result = result * 10 + reminder;
      input /= 10;
    }
    return result;
  }

  public static void main(String[] args) {

    int result = ReverseInteger(123);
    System.out.println("This is the result " + result);

    int result1 = ReverseInteger(456);
    System.out.println("This is the result " + result1);

  }

}
