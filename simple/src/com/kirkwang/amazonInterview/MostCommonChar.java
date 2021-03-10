/*
 * 4/4/19 8:20 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
//https://www.careercup.com/question?id=17912674
package com.kirkwang.amazonInterview;

import java.util.ArrayList;
import java.util.HashMap;

/*
https://www.careercup.com/question?id=17912674
1. Create a hash from the string
2. Sort the hash
3. Return the character from the entry num-1 in this sorted array

Time complexity: O(m) + O(nlog(n)) where m is size of string and n is size of hash table/array
Space: O(n) where n is size of hash array
 */
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
        // loop the key and put into arrayList with count.
        ArrayList<CompChar> arrayList = new ArrayList<>();
        for (Character c : hashMap.keySet()) {
            CompChar cc = new CompChar(c, hashMap.get(c));
            arrayList.add(cc);
        }
        //bubble sort the array with count
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
        private final char aChar;
        private final int aCount;

        CompChar(char c, int count) {
            this.aChar = c;
            this.aCount = count;
        }

    }
}
