package com.kirkwang.HackerRank;

/**
 * Created by kewang on 11/1/17.
 */
public class PrintOddNumber {
    static int[] oddNumbers(int left, int right) {

        if (right < left) {
            return new int[]{};
        }
        int index = 0;
        int[] result = new int[(right - left) / 2];

        for (int temp = left; temp < right; temp++) {

            if (temp % 2 == 0) {
                result[index++] = temp;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        PrintOddNumber mms = new PrintOddNumber();

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        int[] arr = new int[]{1, 3, 5, 7, 9};
        arr = oddNumbers(2, 10);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
