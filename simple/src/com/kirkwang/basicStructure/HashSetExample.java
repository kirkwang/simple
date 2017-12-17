package com.kirkwang.basicStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by amp on 9/21/2015.
 */
public class HashSetExample {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<Integer>();
    set.add(new Integer(1));
    set.add(new Integer(2));
    set.add(new Integer(3));

    for (Iterator i = set.iterator(); i.hasNext(); ) {
      Integer integer = (Integer) i.next();
    }

    set.remove(new Integer(3));

    for (Iterator i = set.iterator(); i.hasNext(); ) {
      Integer integer = (Integer) i.next();
      System.out.println(integer);
    }
  }
}
