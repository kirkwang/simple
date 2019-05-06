/*
 * 5/6/19 1:09 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {
    static void whatFlavors(int[] costs, int money) {
        int m = money;
        int index = 1;
        Map<Integer, List<Integer>> cost2indices = new HashMap<Integer, List<Integer>>();

        for (int cost : costs) {
            if (!cost2indices.containsKey(cost)) {
                cost2indices.put(cost, new ArrayList<Integer>());
            }
            cost2indices.get(cost).add(index++);
        }
        for (int cost : cost2indices.keySet()) {
            if (cost * 2 == m) {
                List<Integer> indices = cost2indices.get(cost);
                if (indices.size() >= 2) {
                    print(indices.get(0), indices.get(1));
                    break;
                }
            } else if (cost2indices.containsKey(m - cost)) {
                print(cost2indices.get(cost).get(0), cost2indices.get(m - cost).get(0));
                break;
            }
        }
    }

    public static void main(String[] args) {

        int m = 4;
        //int[] costs = {1, 4, 5, 3, 2};
        int[] costs = {2, 2, 4, 3};
        whatFlavors(costs, m);

    }

    static void print(int index1, int index2) {
        if (index1 > index2) {
            print(index2, index1);
            return;
        }

        System.out.println(index1 + " " + index2);
    }

}
