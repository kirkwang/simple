package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/9/17.
 */
public class PermCheck {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int[] n = scn.nextInt();
        int[] n = new int[]{1, 2, 3, 6, 4};
        // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
        //  solution(n);
        System.out.print(solution(n));
    }

    public static int solution(int[] A) {
        int length = A.length + 1;
        int sum = length * (length + 1) / 2;

        for (int i = 0; i < length - 1; i++) {
            sum -= A[i];
        }

        return (sum == length ? 1 : 0);
    }
}
