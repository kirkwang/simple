package com.kirkwang.Codility;

/**
 * Created by kewang on 11/15/17.
 * <p>
 * For example, array A such that: A[0] = -3 A[1] = 1 A[2] = 2 A[3] = -2 A[4] = 5 A[5] = 6
 * <p>
 * contains the following example triplets:
 * <p>
 * (0, 1, 2), product is −3 * 1 * 2 = −6 (1, 2, 4), product is 1 * 2 * 5 = 10 (2, 4, 5), product is
 * 2 * 5 * 6 = 60
 * <p>
 * Your goal is to find the maximal product of any triplet.
 * <p>
 * Write a function:
 * <p>
 * int solution(int A[], int N);
 * <p>
 * that, given a non-empty zero-indexed array A, returns the value of the maximal product of any
 * triplet.
 * <p>
 * For example, given array A such that: A[0] = -3 A[1] = 1 A[2] = 2 A[3] = -2 A[4] = 5 A[5] = 6
 * <p>
 * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 * https://github.com/Mickey0521/Codility/blob/master/MaxProductOfThree.java
 */
public class MaxProductOfThree {

    public static int MaxProductOfThree(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }

        java.util.Arrays.sort(A);
        int total = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        int total2 = A[A.length - 1] * A[0] * A[1];  //This case is for -neg * -neg *  max -Pos
        return total > total2 ? total : total2;

    }

    public static void main(String[] args) {

        int[] n = {10, 2, 5, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] m = {-5, 5, -5, 4};

        System.out.println(MaxProductOfThree(n));
        System.out.println(MaxProductOfThree(m));
    }

}
