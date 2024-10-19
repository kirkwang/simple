/*
 * 5/5/19 11:07 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
https://www.hackerrank.com/challenges/find-the-median/problem
 */

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

        Integer[] array = new Integer[]{0, 1, 2, 4, 6, 5, 3};

        Assert.assertEquals(findMedian(Arrays.asList(array)), 3);
        Assert.assertEquals(findMedian(new ArrayList<>()), -1);

    }

    public static int findMedian(List<Integer> arr) {
        if (arr.isEmpty()) {
            return -1;
        }
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }
}
