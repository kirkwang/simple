/*
 * 4/22/19 9:46 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

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

        System.out.println(solve(gridChar) ? "YES" : "NO");

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

}
