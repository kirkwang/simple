package com.kirkwang.basicStructure.JavaHungry;

/**
 * Created by amp on 9/21/2015.
 */
public class Main {

  public static void JavaHungry(String s) {
    System.out.println("String");
  }

  public static void JavaHungry(Object o) {
    System.out.println("Object");
  }

  public static void JavaHungryInt(Integer i) {
    System.out.println("Object");
  }

  public static void JavaHungryExc(Exception e) {
    System.out.println("Exception");
  }

  public static void JavaHungryExc(ArithmeticException ar) {
    System.out.println("ArithmeticException");
  }

  public static void main(String args[]) {
    JavaHungry(null);
    MyClass tester = new MyClass(2, 3);
    System.out.println(tester.multiply(3, 4));
  }
}