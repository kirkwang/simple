package com.kirkwang.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/27/15.
 */
/*
*Given a sorted integer array without duplicates, return the summary of its ranges.

*For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {
    public static void main(String[] args) {
        List sr = SummaryRanges.summaryRanges(new int[]{1, 2, 3, 4, 6, 7, 8, 10});
        for (int i = 0; i < sr.size(); i++) {
            System.out.print(sr.get(i));
        }
    }

    public static List<String> summaryRanges(int[] numbs) {
        List rlt = new ArrayList();
        if (numbs == null || numbs.length < 1)
            return rlt;

        int start = 0, end = 0;

        while (end < numbs.length) {
            if (end + 1 < numbs.length && numbs[end] + 1 == numbs[end + 1]) {
                end++;
            } else {
                if (start == end) { // single number, no sequences
                    rlt.add("\"" + numbs[start] + "\"");
                } else {
                    rlt.add("\"" + numbs[start] + "->" + numbs[end] + "\",");
                }
                end++;
                start = end;
            }
        }
        return rlt;
    }
}
