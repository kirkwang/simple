package com.kirkwang.easy;

import java.util.*;

public class ArrayListSort {

    public static void main(String[] args) {
        String[] array = {"abc", "0", "2", "10"};
        List<String> al = Arrays.asList(array);
        Collections.sort(al);
        int a = 1234512345;

        for (int i = 0; i < al.size(); i++) {
            System.out.println(" Al int i=0 -> " + al.get(i));
        }
        Map<Integer, Character> myMap = new HashMap();
        myMap.put(1, 'a');
        myMap.put(2, 'b');
        myMap.put(3, 'c');
        myMap.put(4, 'd');
        for (int i = 0; i < myMap.size(); i++) {
            System.out.println(" myMap.get(i) int i=0 -> " + al.get(i));
        }
        for (Integer i : myMap.keySet()) { //This is for key only
            System.out.println(" Map.Entry i  -> " + i);
        }
        for (Map.Entry e : myMap.entrySet()) { //This will print map pair 1 = a ....
            System.out.println(" Map.Entry i key hash  -> " + e.getKey().hashCode());
            System.out.println(" Map.Entry i value hash -> " + e.getValue().hashCode());
        }
        for (Object object : al) {
            System.out.println(" object " + object);
        }

        al.forEach(System.out::println);


    }
}
