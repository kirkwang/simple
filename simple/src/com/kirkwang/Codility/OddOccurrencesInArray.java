package com.kirkwang.Codility;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kewang on 11/8/17. For example, given array A such that: A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7 A[6] = 9
 *
 * the function should return 7, as explained in the example above.
 */

public class OddOccurrencesInArray {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    // int[] n = scn.nextInt();
    int[] n = new int[]{2, 2, 1, 4, 4};
    // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
    //  solution(n);
    System.out.print(solution(n));
  }

  public static int solution(int[] A) {
    HashSet<Integer> dups = new HashSet<>();

    for (int aA : A) {
      if (dups.contains(aA)) {
        dups.remove(aA);
      } else {
        dups.add(aA);
      }
    }
    return (int) dups.toArray()[dups.size() - 1];

  }
}
