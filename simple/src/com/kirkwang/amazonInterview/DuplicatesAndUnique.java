/*
 * 4/3/19 12:37 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
//https://www.careercup.com/question?id=5792954178338816
package com.kirkwang.amazonInterview;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesAndUnique {
    public static void findDuplicatesAndUnique() {
        //The final output for the above test case is: 2, 4, 6, 8
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 2, 3, 5, 4, 1, 8, 9, 7};
        int[] arr3 = {1, 3, 5, 7, 9, 2, 1, 4, 6, 5, 8};
        ArrayList<Integer> arr4 = new ArrayList();
        //Todo A. Find Duplicates in Arr1 and Arr2:
        //todo B. Find Uniques in Arr3 and Arr4:

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!set.add(arr2[i])) {
                arr4.add(arr2[i]); //when set has conflite
                // System.out.println(arr4.get(arr4.size()-1));
            }
        }
        set.clear();
        set.addAll(arr4);

        for (int i = 0; i < arr3.length; i++) {
            if (!set.contains(arr3[i])) {
                System.out.println("It is uniqe " + arr3[i]);
            }
        }

    }


    public static void main(String[] args) {
        DuplicatesAndUnique.findDuplicatesAndUnique();
    }
}
