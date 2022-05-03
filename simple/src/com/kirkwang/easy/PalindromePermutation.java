package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/27/15.
 */
/*
Given a string, determine if a permutation of the string could form a palindrome.
For example,
"code" -> False, "aab" -> True, "carerac" -> True.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        PalindromePermutation pp = new PalindromePermutation();
        System.out.print(pp.palindromePermutation("abcdddabcabcda"));
        System.out.print(pp.palindromePermutation("carerac"));
        System.out.print(pp.palindromePermutation("code"));
        System.out.print(pp.palindromePermutation("aab"));
    }

    /*
     * "code"->false, "aab"-> true, "carerac" -> true
     */
    public boolean palindromePermutation(String source) {
      Map<Character, Integer> hm = new HashMap();
        for (int i = 0; i < source.length(); i++) {
            Character c = source.charAt(i);
            if( hm.containsKey(c)){
                hm.put(c, hm.get(c)+1 );
            }else {
                hm.put(c, 1);
            }
        }
        int count = 0;
        for (Integer i : hm.values() ) {
            if (i %2 != 0){
                count ++;
            }
        }
        return count<=1;

      }
}
