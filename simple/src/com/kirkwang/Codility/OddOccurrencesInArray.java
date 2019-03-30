package com.kirkwang.Codility;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 *
 *
 * A non-empty zero-indexed array A consisting of N integers is given.
 * The array contains an odd number of elements, and each element of the array can be paired with
 * another element that has the same value, except for one element that is left unpaired.
 *
 * For example, in array A such that: A[0] = 9  A[1] = 3  A[2] = 9 A[3] = 3  A[4] = 9  A[5] = 7 A[6]
 * = 9
 *
 * the elements at indexes 0 and 2 have value 9, the elements at indexes 1 and 3 have value 3, the
 * elements at indexes 4 and 6 have value 9, the element at index 5 has value 7 and is unpaired.
 *
 *
 * For example, given array A such that: A[0] = 9  A[1] = 3  A[2] = 9 A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
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
