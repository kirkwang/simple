/*
 * 4/24/19 7:06 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.hackerrank.com/challenges/cut-the-sticks/problem
 */
public class CuttheSticks {
    public static void main(String[] args) {

        int[] k = {5, 4, 4, 2, 2, 8};
        int[] l = {1, 2, 3, 4, 3, 3, 2, 1};

        System.out.println(cuttheSticks(k));
    }

    public static int[] cuttheSticks(int[] arr) {
        Arrays.sort(arr);
        List<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("array length " + arr.length);
        arrayList.add(arr.length);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr.length - i);
                arrayList.add(arr.length - i);
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
