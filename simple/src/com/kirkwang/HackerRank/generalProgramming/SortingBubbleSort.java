/*
 * 4/25/19 1:16 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class SortingBubbleSort {

    public static void main(String[] args) {

        int[] input = {6, 4, 1};
        countSwaps(input);

    }

    private static void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    static void countSwaps(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    count++;
                }
            }

        }

        System.out.println("Array is sorted in " + +count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

}
