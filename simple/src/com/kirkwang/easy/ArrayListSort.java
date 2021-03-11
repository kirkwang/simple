package com.kirkwang.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

    public static void main(String[] args) {
        String[] array = {"abc", "0", "2", "10"};
        List<String> al = Arrays.asList(array);
        Collections.sort(al);
        int a = 1234512345;

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        for (Object object : al) {
            System.out.println(object);
        }

        al.forEach(System.out::println);


    }
}
