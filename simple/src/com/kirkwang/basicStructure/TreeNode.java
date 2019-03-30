/*
 * 3/24/19 11:00 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.basicStructure;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    int val;

    TreeNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }
}