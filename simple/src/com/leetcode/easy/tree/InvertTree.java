package com.leetcode.easy.tree;

import com.kirkwang.basicStructure.TreeNode;
import org.testng.Assert;

/**
 * <a href="https://leetcode.com/problems/invert-binary-tree/">...</a>
 * Given the root of a binary tree, invert the tree, and return its root.
 * <p>
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * <p>
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 */
public class InvertTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);

        root.left = left;
        root.right = right;
        return root;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(3));
        root = invertTree(root);
        Assert.assertEquals(root.getVal(), 2);
        Assert.assertEquals(root.getLeft().getVal(), 3);
        Assert.assertEquals(root.getRight().getVal(), 1);
    }
}
