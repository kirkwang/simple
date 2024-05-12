package com.kirkwang.easy;

import com.kirkwang.basicStructure.TreeNode;

/*
* https://leetcode.com/problems/symmetric-tree/description/
*Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Input: root = [1,2,2,3,4,4,3]
Output: true
 */
public class SymmetricTree {
    public static void main(String[] args) {
        SymmetricTree st = new SymmetricTree();

        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(2));
        TreeNode temp = root.getLeft();
        temp.setLeft(new TreeNode(4));
        temp.setLeft(new TreeNode(4));
        temp = root.getRight();
        temp.setLeft(new TreeNode(4));
        temp.setRight(new TreeNode(4));

        System.out.println(st.isSymmetric(root));
    }

    public static boolean isMirror(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        } else if (l == null || r == null) {
            return false;
        } else
            return l.val == r.val && isMirror(l.left, r.right) && isMirror(l.right, r.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }


}

