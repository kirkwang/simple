package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 */
public class CyclicRotation {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int[] n = scn.nextInt();
        int[] n = new int[]{1, 2, 3, 4, 5};
        // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
        //  [3, 8, 9, 7, 6] [9, 7, 6, 3, 8]
        n = solution(n, 2);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);

        }
        // System.out.print(solution(n));
    }

    public static int[] solution(int[] A, int K) {
        if (A == null || A.length == 0) {
            return A;
        }

        for (int j = 0; j < K; j++) {
            int temp = A[A.length - 1];
            for (int i = A.length - 1; i > 0; i--) {

                A[i] = A[i - 1];
            }
            A[0] = temp;
        }

        return A;
    }
}
