package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
        https://leetcode.com/problems/lucky-numbers-in-a-matrix/
        Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

        A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

        Example 1:

        Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        Output: [15]
        Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
        Example 2:

        Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
        Output: [12]
        Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
*/
//@Deprecated(since = "incomplete")
public class LuckyNumbersInAMatrix {

    public static void main(String[] args) {
        int[][] input = new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        int[][] input1 = new int[][]{{7, 8}, {1, 2}};

        List<Integer> result = luckyNumbers(input);
        for (Integer i : result) {
            System.out.println(i);
        }
        result = luckyNumbers(input);
        for (Integer i : result) {
            System.out.println(i);
        }

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int l = matrix.length;
        int min;
        int max;
        int j = 0;
        for (int i = 0; i < l; i++) {
            for (j = 0; j < l; j++) {
                min = Math.min(matrix[i][0], matrix[i][j]);
                answer.add(min);
            }
        }
        for (int i = 0; i < l; i++) {
            for (j = 0; j < l; j++) {
                max = Math.max(matrix[i][0], matrix[i][j]);
                if (answer.contains(max)) {
                    return answer.subList(answer.size() - 1, answer.size());
                }
            }
        }

        return answer.subList(answer.size() - 1, answer.size());
    }


}
