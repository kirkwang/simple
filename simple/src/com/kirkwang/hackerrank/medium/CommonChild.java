/*
 * 4/25/19 9:49 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.medium;
/*
https://www.hackerrank.com/challenges/common-child/problem
 */

import org.testng.Assert;

public class CommonChild {
    public static void main(String[] args) {

        Assert.assertEquals(findMaxCommonLength("HARRY", "SALLY"), 2);
        Assert.assertEquals(findMaxCommonLength("AA", "BB"), 0);
        Assert.assertEquals(findMaxCommonLength("SHINCHAN", "NOHARAAA"), 3);

    }

    static int findMaxCommonLength(String s1, String s2) {

        int[][] commonLengths = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    commonLengths[i][j] = commonLengths[i - 1][j - 1] + 1;
                } else {
                    commonLengths[i][j] = Math.max(commonLengths[i - 1][j], commonLengths[i][j - 1]);
                }
            }
        }
        return commonLengths[s1.length()][s2.length()];
    }

}
