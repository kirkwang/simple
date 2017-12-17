package com.kirkwang.Codility;

/**
 * Created by kewang on 11/9/17. For example, for A = 6, B = 11 and K = 2, your function should
 * return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8
 * and 10.
 */
public class CountDiv {

  public static void main(String[] args) {

    //   Scanner scn = new Scanner(System.in);
    //  int n = scn.nextInt();
    //    int[] A = new int[]{1, 3, 1, 3, 2, 5, 6, 4};
    int[] n = new int[]{1, 3, 4, 6, 2, 1};
    //A = 11, B = 345, K = 17
    System.out.println(solution(11, 345, 17));
  }

  public static int solution(int A, int B, int K) {
    //   (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
    if (B < K) {
      return B / K;
    }

    int num1 = A / K;
    if (A % K != 0) {
      num1++;
    }

    int num2 = B / K;

    return num2 - num1 + 1;
  }

}
