package com.kirkwang.easy;

// Start typing here

import java.util.HashMap;
/*
Sentence:
one cent, two cent, three cent, all cents

word frequency of cent: 3/8 = 0.28

0.2


*/

class WordFrequency {

  public static void main(String[] args) {
    String Sentence = new String("one cent, two cent, three cent, all cents");

    WordFrequency wf = new WordFrequency();
    String[] answer = wf.wordFrequency(Sentence, 0.25);
    for (String temp : answer) {
      System.out.println(temp);
    }
  }

  public String[] wordFrequency(String input, double frequencyLevel) {

    if (input == null || input.length() == 0) {
      return new String[]{};
    }

    String[] splitted = input.trim().split(" ");

    for (int i = 0; i < splitted.length; i++) {
      splitted[i] = splitted[i].replaceAll("[^a-zA-Z0-9]", "");
    }

    HashMap<String, Integer> myMap = new HashMap<>();

    for (int i = 0; i < splitted.length; i++) {
      if (myMap.containsKey(splitted[i])) {
        myMap.put(splitted[i], myMap.get(splitted[i]) + 1);
      } else {
        myMap.put(splitted[i], 1);
      }
    }
    //word frequency of cent: 3/8 = 0.28

    for (int j = 0; j < splitted.length; j++) {
      double feqCount = (double) myMap.get(splitted[j]) / splitted.length;
      if (feqCount > frequencyLevel) {
        splitted[j] = "";
      }
    }
    return splitted;
  }

}