package com.kirkwang.Codility;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 * <p>
 * <p>
 * A non-empty zero-indexed array A consisting of N integers is given.
 * The array contains an odd number of elements, and each element of the array can be paired with
 * another element that has the same value, except for one element that is left unpaired.
 * <p>
 * For example, in array A such that: A[0] = 9  A[1] = 3  A[2] = 9 A[3] = 3  A[4] = 9  A[5] = 7 A[6]
 * = 9
 * <p>
 * the elements at indexes 0 and 2 have value 9, the elements at indexes 1 and 3 have value 3, the
 * elements at indexes 4 and 6 have value 9, the element at index 5 has value 7 and is unpaired.
 * <p>
 * <p>
 * For example, given array A such that: A[0] = 9  A[1] = 3  A[2] = 9 A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * <p>
 * the function should return 7, as explained in the example above.
 */

public class OddOccurrencesInArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int[] n = scn.nextInt();
        // int[] n = new int[]{2, 2, 1,4, 4};
        int[] n = new int[]{9, 3, 9, 3, 1, 4, 4};
        //  solution(n);
        System.out.print(solution(n));
    }

    public static int solution(int[] A) {
        HashSet aA = new HashSet();
        for (int i = 0; i < A.length; i++) {
            if (aA.contains(A[i])) {
                aA.remove(A[i]);
            } else {
                aA.add(A[i]);
            }
        }

        return (int) aA.toArray()[aA.size() - 1];
    }
}
