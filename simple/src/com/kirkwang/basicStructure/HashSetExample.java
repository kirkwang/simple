package com.kirkwang.basicStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amp on 9/21/2015.
 */
public class HashSetExample {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);


    set.remove(3);

    for (Integer integer : set) {
      System.out.println(integer);
    }
  }
}
