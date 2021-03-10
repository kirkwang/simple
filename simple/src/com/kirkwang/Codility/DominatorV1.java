package com.kirkwang.Codility;

import java.util.HashMap;

public class DominatorV1 {
    public static int Dominator(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        HashMap<Integer, Integer> dominator = new HashMap<>();
        int MAX = -1;
        int index = -1;
        for (int i = 0; i < A.length; i++) {
            if (dominator.containsKey(A[i])) {
                dominator.put(A[i], dominator.get(A[i]) + 1);
            } else {
                dominator.put(A[i], 1);
            }
            if (MAX < dominator.get(A[i])) {
                MAX = dominator.get(A[i]);
                index = i;
            }
        }
        return MAX > (A.length / 2) ? index : -1;
    }

    public static void main(String[] args) {

        int[] A = new int[]{1, 3, 3, 3, 4};
        int[] n = new int[]{2, 1, 1, 1, 3};

        System.out.println(n[Dominator(n)]);
    }
}
