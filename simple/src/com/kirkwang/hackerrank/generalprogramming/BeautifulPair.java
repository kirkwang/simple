/*
 * 4/22/19 5:43 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

/*
 https://www.hackerrank.com/challenges/beautiful-pairs/problem
 */
// For an element in A, if there's a matching element in B, this creates a "beautiful pair".
// Each element can only be used once to create a beautiful pair.

// Additionaly, We MUST change exactly 1 element in B. We attempt to change it to create 
// 1 more beautiful pair. In the special case where we already have the max number of 
// beautiful pairs, being forced to change it gives us 1 less beautiful pair.

//  Time Complexity: O(n)
// Space Complexity: O(1)

import org.testng.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class BeautifulPair {

    public static void main(String[] args) {


        int actual = beautifulPairs(new LinkedList<>(Arrays.asList(5, 7, 11, 10, 5, 8)), new LinkedList<>(Arrays.asList(3, 5, 7, 11, 5, 8)));
        Assert.assertEquals(actual, 6);

        actual = beautifulPairs(new LinkedList<>(Arrays.asList(1, 2, 3, 4)), new LinkedList<>(Arrays.asList(1, 2, 3, 3)));
        Assert.assertEquals(actual, 4);

    }


    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        int pairCounter = 0;
        for (Integer i : A) {
            int index = B.indexOf(i);
            if (index > -1) {
                pairCounter++;
                B.remove(index);
            }
        }
        return pairCounter == A.size() ? pairCounter - 1 : pairCounter + 1;

    }


}
