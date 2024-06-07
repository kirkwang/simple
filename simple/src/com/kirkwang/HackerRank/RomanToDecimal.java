package com.kirkwang.HackerRank;

import org.testng.Assert;

import java.util.HashMap;

/*
https://leetcode.com/problems/roman-to-integer/description/
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 */
public class RomanToDecimal {

    public static int rtoi(String input) {

        HashMap<Character, Integer> ht = new HashMap<>();
        ht.put('I', 1);
        ht.put('X', 10);
        ht.put('C', 100);
        ht.put('M', 1000);
        ht.put('V', 5);
        ht.put('L', 50);
        ht.put('D', 500);

        int result = 0;
        int preNumber = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int current = ht.get(input.charAt(i));
            if (preNumber > current) {
                result -= current;
            } else {
                result += current;
            }
            preNumber = current;
        }

        return result;
    }

    public static void main(String[] args) {

        Assert.assertEquals(rtoi("XXXVI"), 36);
        Assert.assertEquals(rtoi("III"), 3);
        Assert.assertEquals(rtoi("MCMXCVI"), 1996);
        Assert.assertEquals(rtoi("LVIII"), 58);
        Assert.assertEquals(rtoi("MCMXCIV"), 1994);
    }

}