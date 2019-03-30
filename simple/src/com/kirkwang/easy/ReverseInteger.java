package com.kirkwang.easy;

/**
 * Created by kewang on 12/13/17.
 */


public class ReverseInteger {

  public static int ReverseInteger(int input) {
    long reversedNum = 0;
    long input_long = input;
    while (input_long != 0) {
      long reminder = input_long % 10;
      reversedNum = reversedNum * 10 + reminder;
      input_long = input_long / 10;

    }

    if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
      return 0;
    }
    return (int) reversedNum;

  }

  public static void main(String[] args) {
//1534236469
    int result = ReverseInteger(-456);
    System.out.println("This is the result " + result);

    int result1 = ReverseInteger(1534236469); //over flow
    System.out.println("This is the result " + result1);

  }

}
