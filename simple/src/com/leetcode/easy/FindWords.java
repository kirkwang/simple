package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
 */
public class FindWords {
    public static void main(String[] args) {
        //WRONG FLOW, NOT WORKING
        String[] input = {"adsdf", "sfd"};

        String[] input_1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = findWords(input_1);
        for (String s : output) {
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        Set<Character> set1 = new HashSet<>();
        for (char c : "qwertyuiop".toCharArray()) {
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for (char c : "asdfghjkl".toCharArray()) {
            set2.add(c);
        }

        Set<Character> set3 = new HashSet<>();
        for (char c : "zxcvbnm".toCharArray()) {
            set3.add(c);
        }

        List<String> result = new ArrayList<>();

        int counter = 0;
        char[] temp;
        for (String w : words) {
            temp = w.toLowerCase().toCharArray();

            for (int i = 0; i < temp.length; i++) {
                if (set1.contains(temp[i])) {
                    counter++;
                } else if (set2.contains(temp[i])) {
                    counter++;
                } else if (set3.contains(temp[i])) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
            if (counter == temp.length) {
                result.add(w);
                counter = 0;
            }
        }

        return result.toArray(new String[words.length]);
    }
}
