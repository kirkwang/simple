package com.kirkwang.Codility;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by kewang on 11/9/17.
 *
 * https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 *
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5. <p> Given A = [1, 2, 3],
 * the function should return 4. <p> Given A = [−1, −3], the function should return 1.
 */

public class MissingInteger {

  public static void main(String[] args) {

    //   Scanner scn = new Scanner(System.in);
    //  int n = scn.nextInt();
    //    int[] A = new int[]{1, 3, 1, 3, 2, 5, 6, 4};
    int[] n = new int[]{1, 3, 4, 6, 2, 1};

    System.out.println(solution(n));
  }

  public static int solution1(int[] A) {
    int max = Integer.MIN_VALUE;
    TreeSet hSet = new TreeSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        //only add positive number
        hSet.add(A[i]);
      }
      if (A[i] > max) {
        max = A[i];
      }
    }
    if (max < 0) {
      return 1;
    }

    int min = (int) hSet.first();
    return min;

  }

  public static int solution(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int max = Integer.MIN_VALUE;
    TreeSet hSet = new TreeSet<>();

    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        hSet.add(A[i]);  //only add positive number
      }
      if (A[i] > max) {
        max = A[i]; // we need to find out weather the biggest number is less then 0
      }
    }

    if (max < 0) {
      return 1;
    }
    int n = hSet.size() + 1;
    int result = n * (n + 1) / 2;  //find the sum total ;

    Iterator<Integer> iterator = hSet.iterator();

    while (iterator.hasNext()) {
      result -= iterator.next();
    }

      return result;
  }


}
