package com.kirkwang.basicStructure;

import java.util.*;

/**
 * Created by amp on 9/21/2015.
 */
public class CollectionAPI {

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        List fruitsList = new ArrayList();

        Collections.addAll(fruitsList, "pear", "banan", "apple");

        Collections.addAll(hashSet, "cherry", "watermelon", "apple");

        Collections.sort(fruitsList, Comparator.naturalOrder());
        Collections.sort(fruitsList, Comparator.reverseOrder());
        //Collections.sort(hashSet); Set can't be sorted

        fruitsList.forEach(System.out::print);
        System.out.println();
        hashSet.forEach(System.out::print);

    }
}
