package com.kirkwang.basicStructure;

/**
 * Created by amp on 9/22/2015.
 */
public class JavaType {

    public static void main(String... args) {

        JavaType test = new JavaType();
        String iAmOfAnArgument = "I am born new";
        test.m1(iAmOfAnArgument);
        System.out.println(iAmOfAnArgument);
        short s = 1;
        int x = 00007;
        int y = 8;
        int z = 12123;
        s += z;
        System.out.println("" + x + y + s);
        if (x == 2) {

        }
    }

    /*
    output
    I am born new
    7812124

     */
    public void m1(String m1) {
        m1 = "Am I going to fly?";
    }
}
