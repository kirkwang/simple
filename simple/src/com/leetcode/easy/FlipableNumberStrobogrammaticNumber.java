package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashMap;

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
66 000 99, return True
6969 return true
6996, return true

Consequently, we could use two pointers, one starts from the beginning and one from the end. If they are equal && substrobogrammatic (not including 6 and 9), continue; else return false.
If not, but could be 6 and 9 or 9 and 6, respectively, continue; else return false;
https://programmersought.com/article/1411588186/
 */
public class FlipableNumberStrobogrammaticNumber {
    public static void main(String[] args) {
        FlipableNumberStrobogrammaticNumber fnumber = new FlipableNumberStrobogrammaticNumber();

        Assert.assertTrue(fnumber.fnsn("66 000 99"));
        Assert.assertTrue(fnumber.fnsn("6 0 0 9"));
        Assert.assertTrue(fnumber.fnsn("6969"));
        Assert.assertTrue(fnumber.fnsn("9006")); //6996
        Assert.assertFalse(fnumber.fnsn("962"));
    }

    /*
     *The numbers are 69, 121, 88, 818
     */
    public boolean fnsn(String number) {
        if (number == null || number.isEmpty()) return true;
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('0', '0');
        hm.put('6', '9');
        hm.put('9', '6');
        hm.put('1', '1');
        hm.put('8', '8');
        hm.put(' ', ' ');

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char temp = number.charAt(i);
            if (!hm.containsKey(temp)) {
                return false;
            }
            sb.append(hm.get(temp));
        }

        return sb.reverse().toString().equals(number);

    }
}
