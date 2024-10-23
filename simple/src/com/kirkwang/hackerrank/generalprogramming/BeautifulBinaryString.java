/*
 * 4/27/19 8:00 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://www.hackerrank.com/challenges/beautiful-binary-string/problem
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/beautiful-binary-string/problem
 */
public class BeautifulBinaryString {

    public static void main(String[] args) {
        Assert.assertEquals(beautifulBinaryString("0100101010".toCharArray()), 3);
        Assert.assertEquals(beautifulBinaryString("0101010".toCharArray()), 2);
        Assert.assertEquals(beautifulBinaryString("01100".toCharArray()), 0);
    }

    static int beautifulBinaryString(char[] sb) {

        int counter = 0;
        for (int i = 2; i < sb.length; i++) {
            if (sb[i - 2] == '0' && sb[i - 1] == '1' && sb[i] == '0') {
                sb[i] = '1';
                counter++;
            }
        }
        return counter;
    }
}
