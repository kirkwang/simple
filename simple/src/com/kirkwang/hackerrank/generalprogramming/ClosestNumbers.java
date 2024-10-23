/*
 * 5/5/19 11:07 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/*
https://www.hackerrank.com/challenges/closest-numbers/problem
 */
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
        List<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i);
        }

        assertArrayEquals(closestNumbers(arrayList).toArray(), new Integer[]{-520, -470, -20, 30});

        // test case 2
        array = new int[]{5, 4, 3, 2};
        arrayList.clear();
        for (int i : array) {
            arrayList.add(i);
        }
        assertArrayEquals(closestNumbers(arrayList).toArray(), new Integer[]{2, 3, 3, 4, 4, 5});
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        arr.sort(Comparator.naturalOrder());
        for (int i = 1; i < arr.size(); i++) {
            min = Math.min(min, arr.get(i) - arr.get(i - 1));
        }
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) - arr.get(i - 1) == min) {
                result.add(arr.get(i - 1));
                result.add(arr.get(i));
            }
        }

        return result;
    }

}
