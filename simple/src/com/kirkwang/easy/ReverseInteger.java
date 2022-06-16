package com.kirkwang.easy;

/**
 * Created by kewang on 12/13/17.
 */


public class ReverseInteger {

    public static int ReverseInteger(int input) {
        long result = 0;

        while (input != 0) {
            long temp = input % 10;
            result = result * 10 + temp;
            input = input / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;

    }

    public static void main(String[] args) {
//1534236469
        int result = ReverseInteger.ReverseInteger(-456);
        System.out.println("This is the result " + result);
        int result1 = ReverseInteger.ReverseInteger(153423646); //over flow
        System.out.println("This 153423646 is the result  " + result1);

    }

}
