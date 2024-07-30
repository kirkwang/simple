package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/27/15.
 */
/*
https://leetcode.com/problems/summary-ranges/description/
*Given a sorted integer array without duplicates, return the summary of its ranges.

*For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {

    public static void main(String[] args) {

        List<String> sr = SummaryRanges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
        for (String string : sr) {
            System.out.println(string);
        }
        sr = SummaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        for (String string : sr) {
            System.out.print(string);
        }
    }

    public static List<String> summaryRanges(int[] numbs) {
        List<String> rlt = new ArrayList<>();
        if (numbs == null || numbs.length < 1) {
            return rlt;
        }

        int start = 0;
        int end = 0;

        while (end < numbs.length) {
            if (end + 1 < numbs.length && numbs[end] + 1 == numbs[end + 1]) {
                end++;
            } else {
                if (start == end) { // single number, no sequences
                    rlt.add("\"" + numbs[start] + "\"");
                } else {
                    rlt.add("\"" + numbs[start] + "->" + numbs[end] + "\",");
                }
                start = ++end;
            }
        }
        return rlt;
    }
}
