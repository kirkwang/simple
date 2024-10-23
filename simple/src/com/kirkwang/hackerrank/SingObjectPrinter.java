package com.kirkwang.hackerrank;

import java.util.Arrays;

/**
 * Created by kewang on 10/31/17.
 */
public class SingObjectPrinter {

    public static void main(String[] args) {
        SingObjectPrinter myPrinter = new SingObjectPrinter();
        int[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.print(intArray);
    }

    public void print(Object o) {
        if (o instanceof String[]) {
            System.out.println(Arrays.toString((String[]) o));
        } else if (o instanceof int[]) {
            System.out.println("This is int[] " + Arrays.toString((int[]) o));
        } else {
            System.out.println(Arrays.toString((Object[]) o));
        }
    }
}