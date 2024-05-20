/*
 * 5/15/19 1:51 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/count-primes/description/
 */
public class PrimeNumber {


    public static int checkAndCount(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; ) {
            if (countPrimes(i)) {
                list.add(i);
            }
            if (i <= 10) {
                i++;
            } else {
                i = i + 2;
            }
        }
        return list.size();
    }

    public static boolean countPrimes(int n) {

        if (n <= 1)
            return false;
        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); ) {
            if (n % i == 0) {
                return false;
            }
            if (i <= 10) {
                i++;
            } else {
                i = i + 2;
            }

        }
        return true;
    }
    public static void main(String[] args) {


        Assert.assertTrue(countPrimes(3));
        Assert.assertEquals(checkAndCount(2), 0);
        Assert.assertEquals(checkAndCount(3), 1);
        Assert.assertEquals(checkAndCount(4), 2);
        Assert.assertEquals(checkAndCount(5), 2);
        Assert.assertEquals(checkAndCount(6), 3);
        Assert.assertEquals(checkAndCount(10), 4);
        Assert.assertEquals(checkAndCount(5000000), 348513);

    }
}
