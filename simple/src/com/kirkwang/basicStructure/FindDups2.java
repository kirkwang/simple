package com.kirkwang.basicStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amp on 9/21/2015.
 */
public class FindDups2 {
  public static void main (String[] args){
    Set<String> uniques = new HashSet<String>();
    Set<String> dups = new HashSet<String>();

    for (String a : args){
      if (!uniques.add(a)){
        dups.add(a);
      }
      uniques.removeAll(dups);
    }
  }
}
