package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/8/17. For example, given array A such that: A[0] = 2 A[1] = 3 A[2] = 1
 * A[3] = 5 <p> the function should return 4, as it is the missing element.
 */
public class PermMissingElem {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int[] n = scn.nextInt();
        int[] n = new int[]{1, 2, 3, 5};
        // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
        //  solution(n);
        System.out.print(solution(n));
    }

    public static long solution(int[] A) {
        if (A.length <= 0) {
            return 1;
        }
        int n = A.length + 1;
        long total = n * (n + 1) / 2;

        for (int i : A) {

            total -= i;
        }

        return (int) total;
    }
}
