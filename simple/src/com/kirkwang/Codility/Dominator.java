package com.kirkwang.Codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/20/17.
 *
 * /** Created by kewang on 11/15/17.
 *
 *
 * https://app.codility.com/programmers/lessons/8-leader/dominator/
 *
 * For example, consider array A such that A[0] = 3    A[1] = 4 A[2] =  3 A[3] = 2    A[4] = 3 A[5]
 * = -1 A[6] = 3    A[7] = 3
 *
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with
 * indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 */
public class Dominator {

  private static int Dominator(int[] A) {
    Map<Integer, Integer> dominator = new HashMap<>();
    int MAX = -1;
    int index = -1;
    for (int i = 0; i < A.length; i++) {
      if (dominator.containsKey(A[i])) {
        dominator.put(A[i], dominator.get(A[i]) + 1);
      } else {
        dominator.put(A[i], 1);
      }

      if (dominator.get(A[i]) > MAX) {
        MAX = dominator.get(A[i]);
        index = i;
      }

    }
    //return index if max is more than half of the list or not found -
    return MAX > (A.length / 2) ? index : -1;
  }

  public static void main(String[] args) {

    int[] A = new int[]{1, 3, 3, 3, 4};
    int[] n = new int[]{2, 1, 1, 1, 3};

    System.out.println(Dominator(A));
  }


}
