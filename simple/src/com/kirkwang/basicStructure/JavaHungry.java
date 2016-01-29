package com.kirkwang.basicStructure;

import java.lang.System;

/**
 * Created by amp on 9/22/2015.
 */
public class JavaHungry {
  public void m1(String m1){
    m1 = "Am I going to fly?";
  }
  public static void main (String... args){

    JavaHungry test = new JavaHungry();
    String iAmOfAnArgument = "I am born new";
    test.m1(iAmOfAnArgument);
    System.out.println(iAmOfAnArgument);
    short s=0;
    int x = 07;
    int y = 8;
    int z= 12123;
    s+=z;
    System.out.println(""+x+y+s);
    if (x==2){

    }
  }
}
