package com.leetcode.easy;

/**
 * Created by kewang on 12/22/17.
 * <p>
 * <a href="https://leetcode.com/problems/excel-sheet-column-title/">...</a>
 * <p>
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
        String result = convertToTitle(28);

        System.out.print("result " + result);
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
