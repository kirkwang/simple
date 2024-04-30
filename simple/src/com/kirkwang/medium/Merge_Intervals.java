package com.kirkwang.medium;

import java.util.ArrayList;
import java.util.List;

public class Merge_Intervals {
/*
    https://leetcode.com/problems/merge-intervals/
    Example 1:

    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
    Example 2:

    Input: intervals = [[1,4],[4,5]]
    Output: [[1,5]]
    Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*/

  public static int[][] merge(int[][] intervals) {
    List<int[]> answer = new ArrayList();
    answer.add(0, intervals[0]);
    int[] current_start = intervals[0];
    int[] current_end = intervals[1];
    for (int[] i : intervals) {
      int begin = i[0];
      int end = i[1];

    }

    return answer.toArray(new int[answer.size()][]);
  }


  public static void main(String[] args) {
    // This is not complete yet.
    int input[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

    input = merge(input);
    int jcount = input[0].length;
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < jcount; j++) {
        System.out.println(input[i][j]);
      }

    }
  }
}
