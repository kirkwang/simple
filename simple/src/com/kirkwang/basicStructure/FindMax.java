package com.kirkwang.basicStructure;

import java.util.Collections;
import java.util.HashSet;

/**
 * Created by amp on 9/21/2015.
 */
public class FindMax {

  public static void main(String[] args){
    HashSet<Long> hashSet = new HashSet<Long>();
    hashSet.add(new Long("1111111"));
    hashSet.add(new Long("2222222"));
    hashSet.add(new Long("3333333"));

  Object obj = Collections.max(hashSet);
  System.out.println(obj);
  }
}
