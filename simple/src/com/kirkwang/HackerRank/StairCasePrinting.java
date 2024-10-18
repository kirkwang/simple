package com.kirkwang.HackerRank;

/**
 * Created by kewang on 10/31/17.
 */

import java.util.Scanner;

/*
https://www.hackerrank.com/contests/indeed-coding-contest/challenges/paint-the-staircase
 */
public class StairCasePrinting {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}

