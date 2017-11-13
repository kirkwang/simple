package com.kirkwang.basicStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amp on 9/21/2015.
 */
public class FindDups2 {
    public static void main(String[] args) {
        String[] stringSet = {"aa", "bb", "cc", "dd", "bb", "aa"};
        Set<String> uniques = new HashSet<String>();

        Set<String> dups = new HashSet<String>();

        for (String a : stringSet) {
            if (!uniques.add(a)) {
                dups.add(a);
            }
        }
        uniques.removeAll(dups); // this method will remove the all the element from unique that are exist in dups
        //    uniques.retainAll(dups);  //this method will keep the common element that in both set

        System.out.println(uniques);
        System.out.println(dups);
    }
}
