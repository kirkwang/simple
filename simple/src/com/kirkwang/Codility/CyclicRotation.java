package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 *
 *
 * https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 *
 *
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each
 * element is shifted right by one index, and the last element of the array is also moved to the
 * first place.
 *
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate
 * array A K times; that is, each element of A will be shifted to the right by K indexes.
 *
 * Write a function that, given a zero-indexed array A consisting of N integers and an integer K,
 * returns the array A rotated K times.
 *
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3,
 * 8].
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
      int temp = A[A.length - 1]; // save the last one
      for (int i = A.length - 1; i > 0; i--) {
        A[i] = A[i - 1]; //shift from the end
      }
      A[0] = temp; //put the temp back to the 1st
      // done with one shift
    }

    return A;
  }
}
