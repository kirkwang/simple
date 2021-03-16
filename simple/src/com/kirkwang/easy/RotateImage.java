/*
 * 3/17/19 5:18 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.easy;

import java.io.IOException;
/*
https://leetcode.com/problems/rotate-image/submissions/
You are given an n x n 2Dmatrix representing an image,rotate the image by 90 degrees(clockwise).

You have to rotate the image in-place,which means you have to modify the input 2Dmatrix directly.DO NOT allocate another 2Dmatrix and do the rotation.
*/

public class RotateImage {

    public static void main(String[] args) throws IOException {
        String[] tokens = new String[]{"2", "1", "/"};
        //[[1,2,3],[4,5,6],[7,8,9]]
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] result = rotate_2_loops(input);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[][] rotate(int[][] matrix) {

        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
        return matrix;
    }

    public static int[][] rotate_2_loops(int[][] matrix) {
/*
1 4 7
2 5 8
3 6 9
  * */

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
/*
        7 4 1
        8 5 2
        9 6 3
*/
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int end_index = matrix[0].length - j - 1;
                int temp = matrix[i][end_index];
                matrix[i][end_index] = matrix[i][j];
                matrix[i][j] = temp;
                //  System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        return matrix;
    }

}
