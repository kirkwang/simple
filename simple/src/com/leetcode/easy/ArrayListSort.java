package com.leetcode.easy;

import java.util.*;

public class ArrayListSort {

    public static void main(String[] args) {
        String[] array = {"abc", "0", "1", "11"};
        Arrays.sort(array);

        List<String> aList = Arrays.asList(array);
        Collections.sort(aList);

        int a = 12232342;
        for (String s : aList) {
            System.out.println("alist " + s);
        }
        Map<Integer, Character> myMap = new HashMap<>();
        myMap.put(1, 'a');
        myMap.put(2, 'b');
        myMap.put(3, 'c');
        myMap.put(4, 'd');
        for (int i = 0; i < myMap.size(); i++) {
            System.out.println(" myMap.get(i) int i=0 -> " + aList.get(i));
        }
        for (Integer i : myMap.keySet()) { //This is for key only
            System.out.println(" Map.Entry i  -> " + i);
        }
        for (Map.Entry e : myMap.entrySet()) { //This will print map pair 1 = a ....
            System.out.println(" Map.Entry i key hash  -> " + e.getKey().hashCode());
            System.out.println(" Map.Entry i value hash -> " + e.getValue().hashCode());
        }
        for (Object object : aList) {
            System.out.println(" object " + object);
        }

        aList.forEach(System.out::println);


    }
}
