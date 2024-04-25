/*
 * 5/5/19 11:07 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
public class MinimumAbsoluteDifferenceinanArray {
    public static void main(String[] args) {

        int[] array = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        //int[] array = {1, -3, 71, 68, 17};

        List<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i);
        }
        System.out.println(minimumAbsoluteDifference(arrayList));

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.size(); i++) {
            min = Math.min(arr.get(i) - arr.get(i - 1), min);
        }
        return min;
    }
}
