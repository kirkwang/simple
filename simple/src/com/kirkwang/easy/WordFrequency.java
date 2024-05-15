package com.kirkwang.easy;

// Start typing here

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
Sentence:
one cent, two cent, three cent, all cents
word frequency of cent: 3/8 = 0.28
0.2
*/

class WordFrequency {

    public static void main(String[] args) {
        String Sentence = "one cent, two cent, three cent, all cents";
        WordFrequency wf = new WordFrequency();
        Set<String> answer = wf.wordFrequency(Sentence, 0.28);
        for (String temp : answer) {
            System.out.println(temp);
        }
    }

    public Set<String> wordFrequency(String input, double frequencyLevel) {

        if (input == null || input.isEmpty()) {
            return new HashSet<>();
        }

        String[] splitted = input.trim().split(" ");

        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = splitted[i].replaceAll("[^a-zA-Z0-9]", "");
        }

        HashMap<String, Integer> myMap = new HashMap<>();

        for (String s : splitted) {
            myMap.put(s, myMap.getOrDefault(s, 0) + 1);
        }

        Set<String> result = new HashSet<>();
        for (String s : splitted) {
            double feqCount = (double) myMap.get(s) / splitted.length;
            if (feqCount > frequencyLevel) {
                result.add(s);
            }
        }
        return result;
    }

}