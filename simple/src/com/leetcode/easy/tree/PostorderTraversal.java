package com.leetcode.easy.tree;

import com.kirkwang.basicStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
 *https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * Input: root = [1,null,2,3]
Output: [3,2,1]
 */
public class PostorderTraversal {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.setRight(new TreeNode(2));
        TreeNode tr = root.getRight();
        tr.setLeft(new TreeNode(3));

        PostorderTraversal pt = new PostorderTraversal();
        List<Integer> results = pt.postorderTraversal(root);
        for (Integer i : results) {
            System.out.print(i + " ");
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }

    private List<Integer> postorderTraversal(TreeNode root, List list) {
        if (root != null) {
            postorderTraversal(root.left, list); //left has to call before right for "post order"
            postorderTraversal(root.right, list);
            list.add(root.val);
        }
        return list;
    }
}
