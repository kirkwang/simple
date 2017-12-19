package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 *
 *
 * https://codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 *
 *
 * Write a function:
 *
 * int solution(int X, int Y, int D);
 *
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a
 * position equal to or greater than Y.
 *
 * For example, given: X = 10 Y = 85 D = 30
 *
 * the function should return 3, because the frog will be positioned as follows:
 *
 * after the first jump, at position 10 + 30 = 40 after the second jump, at position 10 + 30 + 30 =
 * 70 after the third jump, at position 10 + 30 + 30 + 30 = 100
 *
 * Assume that:
 *
 * X, Y and D are integers within the range [1..1,000,000,000]; X ≤ Y.
 *
 * Complexity:
 *
 * expected worst-case time complexity is O(1); expected worst-case space complexity is O(1).
 */
public class FrogJmp {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    // int[] n = scn.nextInt();
    int[] n = new int[]{1, 2, 3, 6, 4};
    // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
    //  solution(n);
    System.out.print(simpleSolutaion(10, 85, 30));
  }

  public static int simpleSolutaion(int X, int Y, int D) {
    if (Y < X || D < X) {
      return 0;
    }
    int diff = Y - X;
    return diff % D == 0 ? (diff / D) : (diff / D) + 1;

  }

  public static int solution(int X, int Y, int D) {

    if (Y < X || D <= 0) {
      return 0;
    }
    int diff = Y - X;
    if (diff % D == 0) {
      return diff / D;
    } else {
      return diff / D + 1;
    }
  }
}
