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
    int n = A.length + 1;
    int sum = n * (n + 1) / 2;

    for (int i = 0; i < n - 1; i++) {
      sum -= A[i];
    }

    return (sum == n ? 1 : 0);
  }
}
