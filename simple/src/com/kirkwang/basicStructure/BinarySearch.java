package com.kirkwang.basicStructure;

/**
 * Created by kewang on 2/27/16.
 */
public class BinarySearch {

    public static int search(int[] A, int k) {
        int NOT_EXIST = -1;

        if (A.length == 0) {
            return NOT_EXIST;
        }

        int start = 0;
        int end = A.length - 1;

        if (A[start] > k) {
            return 0;
        } else if (A[end] <= k) {
            return NOT_EXIST;
        }

        int result = NOT_EXIST;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (A[middle] <= k) {
                start = middle + 1;
            } else {
                result = middle;
                end = middle - 1;
            }
        }

        return result;
    }
}
