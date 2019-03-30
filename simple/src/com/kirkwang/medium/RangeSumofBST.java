package com.kirkwang.medium;

/*
 * 3/24/19 10:55 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

import com.kirkwang.basicStructure.TreeNode;

class RangeSumofBST {
    static int ans;

    public static int findRange(TreeNode node, int L, int R) {
        int ans = 0;
        dfs(node, L, R);
        return ans;
    }

    public static void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (L <= node.getVal() && node.getVal() <= R) {
                ans = ans + node.getVal();
            }
            if (L < node.getVal()) {
                dfs(node.left, L, R);
            }
            if (node.getVal() < R) {
                dfs(node.right, L, R);
            }

        }

    }

    public static void main(String[] args) {

    }
}