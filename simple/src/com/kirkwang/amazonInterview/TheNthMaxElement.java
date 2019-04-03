/*
 * 4/3/19 1:55 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

import java.util.Iterator;
import java.util.TreeSet;

public class TheNthMaxElement {

    public static int findTheNthMaxElement(int[] input, int key) {
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < input.length; i++) {
            treeSet.add(input[i]);
        }

        for (Iterator it = treeSet.descendingIterator(); it.hasNext(); ) {
            Object e = it.next();
            if (--key == 0) {
                System.out.println(e);
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] a = {2, -4, 5, 6, 0, 7, -1, 10, 9};
        int k = 3; //if you want to find out 1 largest then give 0

        TheNthMaxElement.findTheNthMaxElement(a, k);

    }
}
