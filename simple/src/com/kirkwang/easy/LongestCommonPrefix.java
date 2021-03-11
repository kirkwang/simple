package com.kirkwang.easy;

/**
 * Created by kewang on 12/28/15.
 */
/*

https://leetcode.com/problems/longest-common-prefix/description/

Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] sa = new String[3];
        sa[0] = "aaaaa";
        sa[1] = "aaa";
        sa[2] = "aaabc";
        LongestCommonPrefix lcprefix = new LongestCommonPrefix();
        String commStr = lcprefix.LongestCommonPrefix(sa);
        String commStr2 = lcprefix.LongestCommonPrefixV2(sa);

        // System.out.println(commStr);
        System.out.println(commStr);
    }

    public String LongestCommonPrefix(String[] strs) {
        String minStr = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (minStr.length() > strs[i].length()) {
                minStr = strs[i];
            }
        }
        int end = minStr.length();
        for (int i = 0; i < strs.length; i++) {
            int j;
            for (j = 0; j < end; j++) {
                if (minStr.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            if (j < end) {
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

        String str = strs[0];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (strs[j].length() <= i || strs[j].charAt(i) != c) {
                    return str.substring(0, i);
                }


            }
        }

        return str;
    }

}
