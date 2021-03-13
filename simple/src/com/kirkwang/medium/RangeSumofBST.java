package com.kirkwang.medium;

/*
 * 3/24/19 10:55 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

import com.kirkwang.basicStructure.TreeNode;

/*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.
 */
class RangeSumofBST {
    static int ans;

    public static int findRange(TreeNode node, int L, int R) {
        int ans = 0;
        rangeSumBST(node, L, R);
        return ans;
    }

    public static int rangeSumBST(TreeNode root, int L, int H) {
        if (root == null) return 0;
        if (root.getVal() < L)
            return rangeSumBST(root.getRight(), L, H); // if current is smaller then Left/low , go to right
        if (root.getVal() > H) return rangeSumBST(root.getLeft(), L, H);  // if current is bigger then High, go to left.
        return root.getVal() + rangeSumBST(root.getRight(), L, H) + rangeSumBST(root.getLeft(), L, H); // sum current , left and right
    }

    public static void main(String[] args) {

    }
}