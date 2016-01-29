package com.kirkwang.easy;

/**
 * Created by kewang on 12/27/15.
 */
/*
A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
Write a function to determine if a number is strobogrammatic. The number is represented as a string.
For example, the numbers "69", "88", and "818" are all strobogrammatic.
Understand the problem:
The key of the problem is to understand what is called "strobogrammatic number". As defined, the number 0, 1 and 8 are strobogrammatic. However, 6 and 9 are kind of special. E.g.
6 0 0 9, return True
66 000 99, return True;
6969 return true;
6996, return true;

Consequently, we could use two pointers, one starts from the beginning and one from the end. If they are equal && substrobogrammatic (not including 6 and 9), continue; else return false.
If not, but could be 6 and 9 or 9 and 6, respectively, continue; else return false;
 */
public class FlipableNumberStrobogrammaticNumber {
    public static void main(String[] args) {
        FlipableNumberStrobogrammaticNumber fnumber = new FlipableNumberStrobogrammaticNumber();
        boolean flag = fnumber.flipableNumberStrobogrammaticNumber("66 000 99");
        System.out.print(flag);
    }

    /*
    *The numbers are 69, 121, 88, 818
     */
    public boolean flipableNumberStrobogrammaticNumber(String number) {
        for (int i = 0; i < number.length() / 2; i++) {
            char left = number.charAt(i);
            char right = number.charAt(number.length() - 1 - i);
            if (!isflipable(left, right)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean isflipable(char left, char right) {
        switch (left) {
            case '1':
                return right == '1';
            case '6':
                return right == '9';
            case '9':
                return right == '6';
            case '8':
                return right == '8';
            case '0':
                return right == '0';
            default:
                return false;
        }
    }
}
