package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 */
public class BinaryGap {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        BinaryGap(n);
    }

    public static int BinaryGap(int N) {
        int binaryGap = 0;
        String binaryString = Integer.toBinaryString(N);
        char[] characters = binaryString.toCharArray();
        //   int j = 0;
        Character c;
        // for (int i = 0; i < characters.length; i++) {
        for (int j = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                j++;
            } else {
                if (j > binaryGap) {
                    binaryGap = j;
                }

                j = 0;
            }
            //   }

        }
        return binaryGap;

    }
}
