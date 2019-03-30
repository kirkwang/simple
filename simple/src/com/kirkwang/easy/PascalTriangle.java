package com.kirkwang.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/25/15.
 */
/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

 */
public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();

        List tp = pt.pascalTriangle(6);
        for (int i = 0; i < tp.size(); i++) System.out.println(tp.get(i) + " ");
    }

    public List<List<Integer>> pascalTriangle(int numbRows) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();

        Integer[] prev = null;

        for (int i = 1; i <= numbRows; i++) {
            Integer[] current = new Integer[i];
            current[0] = 1;
            current[i - 1] = 1;
            for (int j = 1; j < i - 1; j++)
                current[j] = prev[j - 1] + prev[j];

            //      list.add(new ArrayList<Integer>(Arrays.asList(current)));
            prev = current;
        }
        return list;
    }
}
