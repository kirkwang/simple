package com.kirkwang.Codility;

import java.util.HashSet;
import java.util.Set;

public class AbsDist {
    public static Object[] AbsDis(int[] input) {
        if (input == null || input.length == 0) {
            return new Integer[0];
        }
        Set<Integer> result = new HashSet();
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                input[i] = input[i] * -1;
            }
            result.add(input[i]);
        }

        return result.toArray();
    }

    public static void main(String[] args) {
        int[] n = new int[]{-5, -3, -1, 0, 3, 6};
        Object[] result = AbsDis(n);
        for (Object o : result) {
            System.out.println(o);
        }
    }
}
