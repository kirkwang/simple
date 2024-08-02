/*
 * 4/2/19 1:39 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
//https://www.careercup.com/question?id=5717876079067136
package com.kirkwang.amazonInterview;


import java.util.HashMap;
import java.util.Map;

public class LogIntoTheSystemTheMost {
    public static void main(String[] args) {
        String input = "user1, user4, user2, user1, user3, user1, user2, user3";
        String[] inputArray = input.split(",");
        int key = 2;
        LogIntoTheSystemTheMost logIntoTheSystemTheMost = new LogIntoTheSystemTheMost();
        logIntoTheSystemTheMost.logIntoTheSystemTheMost(inputArray, key);
    }

    public void logIntoTheSystemTheMost(String[] input, int k) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (String temp : input) {
            hashMap.put(temp.trim(), hashMap.getOrDefault(temp.trim(), 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() >= k) {
                System.out.println(entry.getKey() + ",(" + entry.getValue() + ")");
            }
        }

    }
}
