/*
 * 5/1/19 4:05 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;

public class ShortestDistancetoaCharacter {

    public static void main(String[] args) {
        String s = "loveleetcode";

        int[] result = shortoChar(s, 'e');
        for (int i : result) {
            System.out.println(result[i]);
        }
    }

    public static int[] shortestToChar(String S, char C) {
        int beginIndex = 0;
        int[] offsetOfChar = new int[S.length()];
        int fullindex = 0;
        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == C) {
                beginIndex = i;
            }
            offsetOfChar[i] = i - beginIndex;
        }
        return offsetOfChar;
    }

    public static int[] shortoChar(String S, char C) {

        int[] ans = new int[S.length()];

        int index = (int) -1e9;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) index = i;
            ans[i] = i - index;
        }

        index = (int) 1e9;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) index = i;
            ans[i] = Math.min(ans[i], index - i);
        }

        return ans;
    }

}
