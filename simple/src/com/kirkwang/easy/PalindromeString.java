package com.kirkwang.easy;

/**
 * Created by kewang on 12/27/15.
 */
  /*
  Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
   */
public class PalindromeString {
    public static void main(String[] args) {
       System.out.print(PalindromeString.palindromeString("a man , a plan , a canal: panama"));
    }
    public static boolean palindromeString(String source) {
        if (source == null)
            return false;
        if (source.length() == 0)
            return true;
        source = source.replaceAll("[^a-zA-Z0-9]", "");
       // System.out.print(source);
        for (int i = 0; i <= source.length() / 2; i++) {
            if(source.charAt(i) != source.charAt(source.length()-1-i)){
                System.out.println(i);
                return false;
            }
        }
        return true;
    }

    ;
}
