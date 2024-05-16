package com.leetcode.easy.tree;

import com.kirkwang.basicStructure.TreeNode;

/*
* https://leetcode.com/problems/minimum-depth-of-binary-tree/
* Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
* Input: root = [3,9,20,null,null,15,7]
Output: 2

 */
public class MinDepth {
    public static void main(String[] args) {
        MinDepth md = new MinDepth();
        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(9));
        root.setRight(new TreeNode(20));


        TreeNode tr = root.getRight();
        tr.setLeft(new TreeNode(15));
        tr.setRight(new TreeNode(7));

        System.out.println(md.minDepth(root));
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        }
        if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
