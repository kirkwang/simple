package com.kirkwang.easy.tree;
/*
*https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
* Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
 binary search tree.
 * Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 */

import com.kirkwang.basicStructure.TreeNode;

public class SortedArrayToBST {
    public static void main(String[] args) {

        int[] input = {-10, -3, 0, 5, 9};
        TreeNode result = SortedArrayToBST.sortedArrayToBST(input);
        printTreeNode(result);
        System.out.println();
    }

    private static void printTreeNode(TreeNode input) {
        if (input == null) {
            System.out.println("val null");
        }
        if (input != null) {
            System.out.println("val " + input.getVal());
        }

        if (input.left != null) {
            printTreeNode(input.left);
        }
        if (input.right != null) {
            printTreeNode(input.right);

        }

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return arrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode arrayToBST(int[] numbs, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (end + start) / 2;
        TreeNode midNode = new TreeNode(numbs[mid]);
        midNode.left = arrayToBST(numbs, start, mid - 1);
        midNode.right = arrayToBST(numbs, mid + 1, end);
        return midNode;
    }

}
