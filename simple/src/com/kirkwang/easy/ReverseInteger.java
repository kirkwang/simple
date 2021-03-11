package com.kirkwang.easy;

/**
 * Created by kewang on 12/13/17.
 */


public class ReverseInteger {

    public static int ReverseInteger(int input) {
        long reversedNum = 0;

        while (input != 0) {
            long temp = input % 10;
            reversedNum = reversedNum * 10 + temp;
            input = input / 10;
        }
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversedNum;

    }

    public static void main(String[] args) {
//1534236469
        int result = ReverseInteger.ReverseInteger(-456);
        System.out.println("This is the result " + result);
        int result1 = ReverseInteger.ReverseInteger(1534236468); //over flow
        System.out.println("This 1534236469 is the result  " + result1);

    }

}
