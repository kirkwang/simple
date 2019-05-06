/*
 * 5/6/19 3:13 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class Pairs {
    static int pairs(int k, int[] arr) {

        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        return (int) Arrays.stream(arr).filter(number -> set.contains(number + k)).count();
    }

    static int pairsTimeout(int k, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                diff = Math.abs(arr[j] - arr[i]);
                if (!hashMap.containsKey(diff)) {
                    hashMap.put(diff, 1);
                } else {
                    int t = hashMap.get(diff);
                    hashMap.put(diff, ++t);
                }
            }
        }

        return hashMap.get(k) == null ? 0 : hashMap.get(k);
    }

    public static void main(String[] args) {

        int m = 1;
        int[] costs = {363374326, 364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635, 491595254, 879792181, 1069262793};

        //int[] costs = {1, 5, 3, 4 ,2 };
        //pairs(m, costs);
        System.out.println(pairs(m, costs));
    }
}
