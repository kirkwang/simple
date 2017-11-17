package com.kirkwang.Codility;

/**
 * Created by kewang on 11/16/17.
 */
public class CountFactors {

  public static int CountFactors(int N) {
    int result = 0;
    int A = N;
//    for (int i = 1; i * i <= A; i++) {
//      if (i * i == A) {
//        return ++result;
//      }
//      if (A % i == 0) {
//        result += 2;
//      }
//    }
//    return result;
//
    int i = 1;
    while (i < Math.sqrt(N)) {
      if (N % i++ == 0) {
        result += 2;
      }

    }
    if (Math.pow(i, 2) == N) {

      result++;
    }

    return result;
  }

  public static void main(String[] args) {

    System.out.println(CountFactors(16));
  }

}
