/*
 * 5/5/19 11:07 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//https://www.hackerrank.com/challenges/find-the-median/problem
/*
7
0 1 2 4 6 5 3
Sample Output 0

3
Explanation 0

The sorted . It's middle element is at .
 */
public class FindtheMedian {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 4, 6, 5, 3};

        List<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i);
        }
        System.out.println(findMedian(arrayList));

    }

    public static int findMedian(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        return arr.get(arr.size() / 2);
    }
}
