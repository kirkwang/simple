/*
 * 5/5/19 11:07 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

//https://www.hackerrank.com/challenges/closest-numbers/problem
/*
Sample Input 2
4
5 4 3 2

Sample Output 2
2 3 3 4 4 5
Explanation 2
Here, the minimum difference is 1. Valid pairs are (2, 3), (3, 4), and (4, 5).
 */
public class ClosestNumbers {
    public static void main(String[] args) {

        int[] array = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470};
        //int[] array = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};
        // int[] array = {6, 4 ,3 ,2};

        List<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i);
        }
        System.out.println(closestNumbers(arrayList));

    }

    public static ArrayList closestNumbers(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        int min = Integer.MAX_VALUE;
        HashMap<Integer, ArrayList> hashMap = new HashMap<>();
        ArrayList arrayList;
        for (int i = 1; i < arr.size(); i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i - 1));
            min = Math.min(diff, min);
            if (hashMap.containsKey(diff)) {
                arrayList = hashMap.get(diff);
                arrayList.add(arr.get(i - 1));
                arrayList.add(arr.get(i));

            } else {
                arrayList = new ArrayList<>();
                arrayList.add(arr.get(i - 1));
                arrayList.add(arr.get(i));
                hashMap.put(diff, arrayList);

            }
        }

        return hashMap.get(min);
    }
}
