package com.leetcode.easy;

import org.testng.Assert;

/**
 * Created by kewang on 12/28/15.
 */
/*

https://leetcode.com/problems/longest-common-prefix/description/
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] sa = new String[3];
        sa[0] = "aaaaa";
        sa[1] = "aabc";
        sa[2] = "aaabc";
        LongestCommonPrefix lcprefix = new LongestCommonPrefix();

        Assert.assertEquals(lcprefix.LongestCommonPrefixV2(sa), "aa");
        Assert.assertEquals(lcprefix.LongestCommonPrefixV2(new String[]{"flower", "flow", "flight"}), "fl");

    }

    public String LongestCommonPrefix(String[] strs) {
        String minStr = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (minStr.length() > strs[i].length()) {
                minStr = strs[i];
            }
        }
        int end = minStr.length();
        for (String str : strs) {
            int j;
            for (j = 0; j < end; j++) {
                if (minStr.charAt(j) != str.charAt(j)) {
                    break;
                }
            }
            if (j < end) { //keep the location of un-matching char
                end = j;
            }
        }
        return minStr.substring(0, end);
    }

    public String LongestCommonPrefixV2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String result = strs[0];

        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (strs[j].length() == i || strs[j].charAt(i) != c) {
                    return result.substring(0, i);
                }

            }
        }

        return result;
    }

}
