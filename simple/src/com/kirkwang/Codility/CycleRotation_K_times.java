package com.kirkwang.Codility;

import java.util.Scanner;

public class CycleRotation_K_times {
    public static int[] solution(int[] input, int k) {
        if (input == null || input.length == 0) {
            return input;
        }
        for (int i = 0; i < k; i++) {
            int lastElement = input[input.length - 1];
            for (int j = input.length - 1; j > 0; j--) {
                input[j] = input[j - 1];
            }
            input[0] = lastElement;
        }

        return input;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int[] n = scn.nextInt();
        int[] n = new int[]{3, 8, 9, 7, 6};
        // int[] n = new int[]{  9, 3, 9, 3, 1, 4, 4};
        //  [3, 8, 9, 7, 6] [9, 7, 6, 3, 8]
        n = solution(n, 3);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);

        }
        // System.out.print(solution(n));

    }
}