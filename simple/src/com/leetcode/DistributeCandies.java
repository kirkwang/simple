/*
 * 5/1/19 2:55 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/distribute-candies/
 */
public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        return Math.min(candies.length / 2, Arrays.stream(candies).collect(HashSet<Integer>::new, Set::add, Set::addAll).size());
    }

}
