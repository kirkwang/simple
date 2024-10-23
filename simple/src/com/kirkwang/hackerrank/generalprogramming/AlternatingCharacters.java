/*
 * 4/25/19 9:06 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/alternating-characters/problem
样例输入：

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
样例输出：

3
4
0
0
4
样例解释：

, 需要删除3个字符
, 需要删除4个字符
, 需要删除0个字符
, 需要删除0个字符
, 需要删除4个字符
 */
public class AlternatingCharacters {
    public static void main(String[] args) {

        String[] inputArray = {"AAAA", "BBBBB", "ABABABAB", "BABABA", "AAABBB"};
        int[] result = alternatingCharacters(inputArray);
        Assert.assertTrue(Arrays.equals(result, new int[]{3, 4, 0, 0, 4}));
    }

    static int[] alternatingCharacters(String[] s) {
        int counter = 0;
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 1; j < s[i].length(); j++) {
                if (s[i].charAt(j - 1) == s[i].charAt(j)) {
                    counter++;
                }
            }
            result[i] = counter;
            counter = 0;
        }
        return result;
    }
}
