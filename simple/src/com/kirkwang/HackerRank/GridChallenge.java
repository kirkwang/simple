/*
 * 4/22/19 9:46 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

@Deprecated
public class GridChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grid;
//        int T = sc.nextInt();
//        for (int tc = 0; tc < T; tc++) {
//            int N = sc.nextInt();
//           grid = new char[N][N];
//            for (int i = 0; i < N; i++) {
//                String line = sc.next();
//                for (int j = 0; j < N; j++) {
//                    grid[i][j] = line.charAt(j);
//                }
//            }

        char[][] gridChar = {
                {'e', 'b', 'a', 'c', 'd'},
                {'f', 'g', 'h', 'i', 'j'},
                {'o', 'l', 'm', 'k', 'n'},
                {'t', 'r', 'p', 'q', 's'},
                {'x', 'y', 'w', 'u', 'v'}};

        System.out.println(canConvert(gridChar) ? "YES" : "NO");

        // sc.close();
    }

    static boolean solve(char[][] grid) {
        Arrays.stream(grid).forEach(Arrays::sort);
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //  a(97) < f(102), b(98) < g(103)
                if (grid[i][j] > grid[i + 1][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static String canConvert(String[] grid) {
        char[][] gridChar = new char[grid.length][grid[0].length()];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                gridChar[i][j] = grid[i].charAt(j);
            }
        }
        return canConvert(gridChar) ? "YES" : "NO";
    }

    static boolean canConvert(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Arrays.stream(grid).forEach(Arrays::sort);
//    for(int row =0; row < rows; row ++) {
//        Arrays.sort(grid[row]);
//    }
        //This is a bug on row =0; it should be row =1 and compare to row -1
        for (int row = 0; row < rows; row++) {
            for (int col = row + 1; col < cols; col++) {
                if (grid[row][col] > grid[row + 1][col]) {
                    return false;
                }
            }
        }
        return true;
    }

}
