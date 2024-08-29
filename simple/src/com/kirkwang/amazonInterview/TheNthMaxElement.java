/*
 * 4/3/19 1:55 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
https://www.careercup.com/question?id=182717
 */
public class TheNthMaxElement {


    public static int findTheNMaxElement(int[] input, int key) {
        SortedSet<Integer> treeSet = new TreeSet<>();
        for (int j : input) {
            treeSet.add(j);
        }
        List<Object> a = Arrays.asList(treeSet.toArray());
        if (key < 1) {
            return -1;
        }
        if (key > a.size()) {
            return -1;
        }
        return (int) a.get(a.size() - key);

    }

    public static void main(String[] args) {


        int[] a = {1, 2, 5, 6, 7, 8, 10, 11, 4};

        Assert.assertEquals(TheNthMaxElement.findTheNMaxElement(a, 1), 11);
        Assert.assertEquals(TheNthMaxElement.findTheNMaxElement(a, 2), 10);

        Assert.assertEquals(TheNthMaxElement.findTheNMaxElement(a, 9), 1);
        Assert.assertEquals(TheNthMaxElement.findTheNMaxElement(a, 0), -1);
        Assert.assertEquals(TheNthMaxElement.findTheNMaxElement(a, 110), -1);
    }
}
