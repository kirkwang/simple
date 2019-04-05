/*
 * 4/4/19 8:20 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
//https://www.careercup.com/question?id=17912674
package com.kirkwang.amazonInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MostCommonChar {
    public static char findMostCommonChar(String input, int key) {
        char output = ' ';
        HashMap<Character, Integer> hashMap = new HashMap();

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        Set<Character> set = hashMap.keySet();
        ArrayList<CompChar> arrayList = new ArrayList<>();
        for (Character ob : set) {
            CompChar cc = new CompChar(ob, hashMap.get(ob));
            arrayList.add(cc);
        }
        for (int outer = 0; outer < arrayList.size(); outer++) {
            for (int inner = 0; inner < outer; inner++) {
                if (arrayList.get(inner).aCount < arrayList.get(outer).aCount) {
                    CompChar temp = arrayList.get(inner);
                    arrayList.set(inner, arrayList.get(outer));
                    arrayList.set(outer, temp);
                }
            }
        }

        for (CompChar cc : arrayList) {
            System.out.println(cc.aChar + " " + cc.aCount);
        }

        return output;
    }

    public static void main(String[] args) {
        char commonChar = MostCommonChar.findMostCommonChar("Aabra Ka Daabra", 1);
        System.out.println(commonChar);

    }

    public static class CompChar {
        private char aChar;
        private int aCount;

        CompChar(char c, int count) {
            this.aChar = c;
            this.aCount = count;
        }

    }
}
