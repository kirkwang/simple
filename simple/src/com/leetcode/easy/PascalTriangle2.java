package com.leetcode.easy;

import java.util.ArrayList;

/**
 * Created by kewang on 12/25/15.
 */
/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalTriangle2 {
    public static void main(String[] args) {
        PascalTriangle2 pt2 = new PascalTriangle2();
        ArrayList pt2result = pt2.pascalTriangleGetRow(5);
        for (int i = 0; i < pt2result.size(); i++)
            System.out.print(pt2result.get(i) + " ");
    }

    public ArrayList<Integer> pascalTriangleGetRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(1);

        for (int i = 0; i < rowIndex; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        return result;
    }
}
