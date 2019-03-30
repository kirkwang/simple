package com.kirkwang.HackerRank;

/**
 * Created by kewang on 11/1/17.
 */
public class PrintOddNumber {
    static int[] oddNumbers(int l, int r) {
        int[] oddnumbers = null;
        int arraryindex = 0;
        if (r < l) {
            return oddnumbers;
        }
        oddnumbers = new int[(r - l) / 2];
        for (int index = l; index < r; index++) {
            if (index % 2 != 0) {
                System.out.println(index);
                oddnumbers[arraryindex++] = index;
            }
        }
        return oddnumbers;
    }

    public static void main(String[] args) {
        PrintOddNumber mms = new PrintOddNumber();

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        int[] arr = new int[]{1, 3, 5, 7, 9};
        oddNumbers(2, 10);
    }
}
