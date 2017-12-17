package com.leetcode.backTrackGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/16/17.
 *
 * https://leetcode.com/problems/palindrome-partitioning/description/
 *
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 *
 * Return all possible palindrome partitioning of s.
 *
 * For example, given s = "aab", Return
 *
 * [ ["aa","b"], ["a","a","b"] ]
 */
public class PalindromePartitioning {

  public static List<List<String>> PalindromePartitioning(String input) {
    List<List<String>> list = new ArrayList<>();
    if (input == null || input.length() == 0) {
      return null;
    }

    generator(list, new ArrayList<>(), input, 0);

    return list;
  }

  private static void generator(List<List<String>> list, ArrayList<String> sublist, String input,
      int index) {
    if (input.length() == index) {
      list.add(new ArrayList<>(sublist));
    } else {
      for (int i = index; i < input.length(); i++) {

        if (checkPalindrome(input, index, i)) {
          sublist.add(input.substring(index, i + 1));
          generator(list, sublist, input, i + 1);
          sublist.remove(sublist.size() - 1);
        }
      }

    }

  }

  private static boolean checkPalindrome(String input, int i, int j) {
    while (i < j) {
      if (input.charAt(i++) != input.charAt(j--)) {
        return false;
      }
    } // this loop goes from two far ends to middle
    return true;
  }

  public static void main(String[] args) {

    System.out.println("This is the result " + PalindromePartitioning("aab"));

  }

}