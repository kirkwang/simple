/*
  3/24/19 11:00 PM : for the current date and time;
  2019 : to access the year information of the current date;
  kirkwang : the currently used username;
 */

package com.kirkwang.basicStructure;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
