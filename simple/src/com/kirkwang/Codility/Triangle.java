package com.kirkwang.Codility;


/**
 * Created by kewang on 11/8/17. For example, consider array A such that: A[0] = 10    A[1] = 2 A[2]
 * = 5 A[3] = 1     A[4] = 8    A[5] = 20
 *
 * Triplet (0, 2, 4) is triangular.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a zero-indexed array A consisting of N integers, returns 1 if there exists a
 * triangular triplet for this array and returns 0 otherwise.
 *
 * For example, given array A such that: A[0] = 10    A[1] = 2    A[2] = 5 A[3] = 1     A[4] = 8
 * A[5] = 20
 *
 * the function should return 1, as explained above. Given array A such that: A[0] = 10    A[1] = 50
 * A[2] = 5 A[3] = 1
 *
 * the function should return 0.
 */
public class Triangle {

  public static int Triangle(int[] A) {
    if (A.length <= 0 || A == null) {
      return 0;
    }

    java.util.Arrays.sort(A);
    for (int i = 2; i < A.length; i++) {
      if (A[i - 2] + A[i - 1] > A[i] && A[i - 2] + A[i - 1] <= Integer.MAX_VALUE) {
        return 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {

    int[] n = {10, 2, 5, 1, 8, 20};

    Triangle(n);
  }


}
