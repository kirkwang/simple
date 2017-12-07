package com.kirkwang.DynamicProgramming;

/**
 * Created by kewang on 11/28/17.
 */
public class OccurrencesOfSubstring {

  public static int OccurrencesOfSubstring(String source, String target) {
    int lastIndex = 0;
    int count = 0;

    while (lastIndex != -1) {
      lastIndex = target.indexOf(source, lastIndex);
      //  lastIndex = target.lastIndexOf(source);
      if (lastIndex != -1) {
        count++;
        lastIndex += source.length();
      }
    }
    return count;
  }

  public static void main(String[] args) {

    int[] m = new int[]{1, 3, 7, 9, 9};
    int[] n = new int[]{5, 6, 8, 9, 10};
    String equal1 = "equal";
    String equal2 = "Equal";
    String equal3 = new String("Equal");

    System.out.println("two string comparesion with equals " + equal1.equals(equal2));
    System.out.println(
        "two string comparesion with ignore case equals " + equal1.equalsIgnoreCase(equal2));
    System.out.println("two string comparesion with NEW string " + equal2.equals(equal3));
    System.out.println("two string comparesion with == string " + equal2 == equal3);
    System.out.println("two string comparesion with subString of 2 eq ual " + equal1.substring(2));
    System.out.println("two string comparesion with compareTo  " + equal1.compareTo("equal"));
    System.out.println("two string comparesion with compareTo  " + equal1.compareTo("fqubl"));
    System.out.println("two string comparesion with compareTo  " + equal1.split("u")[0]);
    System.out.println("two string comparesion with endsWith  " + equal1.endsWith("al"));
    System.out.println("two string comparesion with chars  " + equal1.toCharArray()[0]);
    System.out.println(OccurrencesOfSubstring("cat", "atdogcatcatdog"));

  }

}