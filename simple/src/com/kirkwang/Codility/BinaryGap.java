package com.kirkwang.Codility;

import java.util.Scanner;

/**
 * Created by kewang on 11/8/17.
 * <p>
 * https://codility.com/programmers/lessons/1-iterations/binary_gap/
 * <p>
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation
 * 10000010001 and so its longest binary gap is of length 5.
 */
public class BinaryGap {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(BinaryGap_toCharArry(n));
    }

    public static int BinaryGap_toCharArry(int N) {
        String binaryFormat = Integer.toBinaryString(N);

        int distance = 0;
        int result = 0;
        for (int i = 0; i < binaryFormat.length(); i++) {
            if (binaryFormat.charAt(i) == '0') {
                distance++;
            } else if (distance > 0) {
                result = distance > result ? distance : result;
                distance = 0;
            }

        }
        return result;
    }


    public static int BinaryGap(int N) {
        int binaryGap = 0;
        //   String binaryString = Integer.toBinaryString(N);
        //   char[] characters = binaryString.toCharArray(); // count number of zero's in 10000010001
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
