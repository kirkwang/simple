package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/8/17. For example, given: X = 10 Y = 85 D = 30
 *
 * the function should return 3, because the frog will be positioned as follows:
 *
 * after the first jump, at position 10 + 30 = 40 after the second jump, at position 10 + 30 + 30 =
 * 70 after the third jump, at position 10 + 30 + 30 + 30 = 100
 */
public class FrogJmp {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    // int[] n = scn.nextInt();
    int[] n = new int[]{1, 2, 3, 6, 4};
    // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
    //  solution(n);
    System.out.print(solution(10, 85, 30));
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
