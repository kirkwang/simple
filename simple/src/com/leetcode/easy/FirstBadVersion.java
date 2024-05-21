package com.leetcode.easy;

/**
 * https://leetcode.com/problems/first-bad-version/
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Example 1:
 * <p>
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 * <p>
 * Input: n = 1, bad = 1
 * Output: 1
 */
public class FirstBadVersion {
    public static void main(String[] args) {
    }

    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while (low < high) {
            int middle = low + (high - low) / 2;
         /*   if( isBadVersion(middle)){
                high = middle;
            } else {
                low = middle+1;
            }
        */
        }
        return high;
    }
}
