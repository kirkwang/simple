package com.leetcode.easy.tree;
/*
*https://leetcode.com/problems/maximum-depth-of-binary-tree/
* Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
* Input: root = [3,9,20,null,null,15,7]
Output: 3
*
 */

import com.kirkwang.basicStructure.TreeNode;

public class MaxDepth {
    public static void main(String[] args) {
        MaxDepth md = new MaxDepth();
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));


        TreeNode tr = root.getLeft();
        tr.setLeft(new TreeNode(2));
        tr.setRight(new TreeNode(3));
        tr = tr.getRight();
        tr.setRight(new TreeNode(5));


        System.out.println(md.maxDepth(root));
    }

    private static int countLevel(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(countLevel(root.left), countLevel(root.right));
    }

    public int maxDepth(TreeNode root) {

        return countLevel(root);
    }


}
