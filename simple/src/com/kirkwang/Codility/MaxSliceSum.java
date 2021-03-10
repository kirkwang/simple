package com.kirkwang.Codility;

/**
 * Created by kewang on 11/16/17. For example, given array A such that: A[0] = 3  A[1] = 2  A[2] =
 * -6 A[3] = 4  A[4] = 0
 * <p>
 * the function should return 5 because:
 * <p>
 * (3, 4) is a slice of A that has sum 4, (2, 2) is a slice of A that has sum −6, (0, 1) is a slice
 * of A that has sum 5, no other slice of A has sum greater than (0, 1).
 */
public class MaxSliceSum {

    public static int MaxSliceSum(int[] A) {
        int maxEnd = A[0];
        int biggest = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEnd = Math.max(A[i], maxEnd + A[i]);
            biggest = Math.max(biggest, maxEnd);
        }
        return biggest;
    }

    public static void main(String[] args) {

        int[] A = new int[]{23171, 21011, 21123, 21366, 21013, 21367};
        int[] n = new int[]{3, 2, -6, 4, 0}; //5, 4, 3, 2, 1
//    A[0] = 23171;
//    A[1] = 21011;
//    A[2] = 21123;
//    A[3] = 21366;
//    A[4] = 21013;
//    A[5] = 21367;

        System.out.println(MaxSliceSum(n));
    }

}
