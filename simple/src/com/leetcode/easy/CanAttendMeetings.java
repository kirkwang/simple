package com.leetcode.easy;

import java.util.Arrays;

/**
 * Created by kewang on 3/3/16.
 */
public class CanAttendMeetings {
    public static void main(String[] args) {
    }

    public static boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> a.start - b.start);
        int maxend = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) {
                return false;
            }
        }
        return true;
    }

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }
}
