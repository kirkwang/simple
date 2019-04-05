package com.kirkwang.basicStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by amp on 9/21/2015.
 */
public class FindDups2 {

  public static void printUniqeWords(List<String> strings) {
    if (strings == null) {
      return;
    }
    Set uniqe = new HashSet<>();
    for (Object a : strings) {
      if (uniqe.add(a)) {
        System.out.println("This is a unique string " + a);
      }
    }
  }

  public static void main(String[] args) {
    String[] strings = {"aa", "bb", "cc", "dd", "bb", "aa"};
    Set<String> uniques = new HashSet<String>();

    Set<String> dups = new HashSet<>();

    printUniqeWords(Arrays.asList(strings));
    printUniqeWords(null);

    for (String a : strings) {
      if (!uniques.add(a)) {
        dups.add(a);
        System.out.println(a);

      }
    }

      //   uniques.removeAll(dups); // this will remove the all the element from unique that are exist in dups

    System.out.println("This is the uniques before retainAll " + uniques);

    uniques.retainAll(dups);  //this method will keep the common element that in both set
    System.out.println("This is the uniques after retainAll " + uniques);

      System.out.println(dups);
  }
}
