package com.kirkwang.easy;
/*
https://leetcode.com/problems/same-tree/description/
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */

import com.kirkwang.basicStructure.TreeNode;

public class SameTree {

    public static void main(String[] args) {
        SameTree st = new SameTree();
        TreeNode tl = new TreeNode(1);
        tl.setLeft(new TreeNode(2));
        tl.setRight(new TreeNode(3));

        TreeNode tr = new TreeNode(1);
        tr.setLeft(new TreeNode(2));
        tr.setRight(new TreeNode(3));

        System.out.println(st.isSameTree(tl, tr));
    }

    public boolean isSameTree(TreeNode tl, TreeNode tr) {
        if (tl == null && tr == null) {
            return true;
        } else if (tl == null || tr == null) {
            return false;
        }
        return tl.getVal() == tr.getVal() && isSameTree(tl.getLeft(), tr.getLeft()) && isSameTree(tl.getRight(), tr.getRight());
    }
}
