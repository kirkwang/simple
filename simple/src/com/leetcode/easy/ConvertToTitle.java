package com.leetcode.easy;

import org.testng.Assert;

/**
 * Created by kewang on 12/22/17.

 href="https://leetcode.com/problems/excel-sheet-column-title/
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 * Example 1:
 * <p>
 * Input: columnNumber = 1
 * Output: "A"
 * Example 2:
 * <p>
 * Input: columnNumber = 28
 * Output: "AB"
 */
public class ConvertToTitle {

    public static void main(String[] args) {


        Assert.assertEquals(convertToTitle(1), "A");
        Assert.assertEquals(convertToTitle(28), "AB");
        Assert.assertEquals(convertToTitle(701), "ZY");

    }


    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            char c = (char) ('A' + (columnNumber - 1) % 26);
            sb.append(c);
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
