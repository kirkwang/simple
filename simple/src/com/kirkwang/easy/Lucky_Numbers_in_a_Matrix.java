package com.kirkwang.easy;

import java.io.IOException;
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
public class Lucky_Numbers_in_a_Matrix {

    public static void main(String[] args) throws IOException {
        int[][] input = new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};

        List<Integer> result = luckyNumbers(input);
        for (Integer i : result) {
            System.out.println(i);
        }
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int N = matrix.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                min = Math.min(matrix[i][0], matrix[i][j]);
                answer.add(min);
            }
        }
        for (int i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                max = Math.max(matrix[i][0], matrix[i][j]);
                if (answer.contains(max)) {
                    return answer;
                }
            }
        }

        return answer;
    }


}
