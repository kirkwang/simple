package com.kirkwang.easy;

/**
 * Created by amp on 9/24/2015.
 */
public class ReplaceChar {
//  Write a Java program to replace certain characters from String like
//  public String replace(String str, char ch)
//  This is a tricky one of the written test my friend had appeared recently. This Java coding question can be solved in multiple way 
// e.g. by using charAt() or subString() method,  but any approach throws couple of follow-up question 
// e.g. you may be asked to write two version to solve this coding exercise, 
// one by using recursion and other by using Iteration. 
// They may also ask you to write JUnit test for this function which means handling null, empty string etc. 
// By the way this programming question is quite common on technical interviews not just Java but also C, C++ or Scala, 
// but knowing API definitely helps to produce better solution quickly.

    public static void main(String... args) {
        String target = "eBay Google Paypal";
        System.out.println("Output for replaceCharAt(): " + ReplaceChar.replaceCharAt(target, target.length() - 1, '$'));
        System.out.println("Output for removeChar(): " + ReplaceChar.removeChar("eBay Google Paypal", 'a'));
        //  System.out.println("Output for removeCharAt(): " + ReplaceChar.removeCharAt("eBay Google Paypal", 5));
    }

    private static String replaceCharAt(String s, int i, char c) {
        StringBuffer buf = new StringBuffer();
        buf.append(s);
        if (i < s.length()) {
            buf.setCharAt(i, c);
        }
        return buf.toString();
    }

    private static String removeChar(String s, char c) {

        StringBuffer buf = new StringBuffer();
        buf.setLength(s.length());
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur != c) buf.setCharAt(current++, cur);
        }
        return buf.toString();
    }

    private static String removeCharAt(String s, int i) {
        StringBuffer buf = new StringBuffer(s.length() - 1);
        buf.append(s, 0, i).append(s.substring(i + 1));
        return buf.toString();
    }

    private static String deleteAllNonDigit(String s) {
        String temp = s.replaceAll("\\D", "");
        return temp;
    }

    public static String repalceAllChar(String s, String f, String r) {
        String temp = s.replace(f, r);
        return temp;
    }

//  private static String removeCharAt(String s, int i) {
//    StringBuffer buf = new StringBuffer(s.length() -1);
//    buf.append(s.substring(0, i)).append(s.substring(i+1));
//    return buf.toString();
//  }

/*
  private static String replaceCharAt(String s, int i, char c){
    StringBuffer buf = new StringBuffer(s);
    buf.setCharAt(i, c);
    return buf.toString();
  }
*/

/*
  private static String removeChar(String s, char c) {
    StringBuffer buf = new StringBuffer(s.length());
    buf.setLength(s.length());
    int current = 0;
    for (int i=0; i<s.length(); i++){
      char cur = s.charAt(i);
      if(cur != c) buf.setCharAt(current++, cur);
    }
    return buf.toString();
  }

  private static String replaceCharAt(String s, int i, char c) {
    StringBuffer buf = new StringBuffer(s);
    buf.setCharAt(i, c);
    return buf.toString();
  }
*/


}
