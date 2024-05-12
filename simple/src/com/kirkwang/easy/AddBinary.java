package com.kirkwang.easy;

/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

 */
public class AddBinary {
    public static void main(String[] args) {
        AddBinary ad = new AddBinary();
        String a = "11";
        String b = "1";
        System.out.println(ad.addBinary(a, b));

    }

    public String addBinary(String a, String b) {

        if (a == null || a.isEmpty())
            return b;
        if (b == null || b.isEmpty())
            return a;

        int pa = a.length() - 1;
        int pb = b.length() - 1;

        int flag = 0;
        StringBuilder sb = new StringBuilder();
        while (pa >= 0 || pb >= 0) {
            int va = 0;
            int vb = 0;

            if (pa >= 0) {
                va = a.charAt(pa) == '0' ? 0 : 1;
                pa--;
            }
            if (pb >= 0) {
                vb = b.charAt(pb) == '0' ? 0 : 1;
                pb--;
            }

            int sum = va + vb + flag;
            if (sum >= 2) {
                sb.append(sum - 2);
                flag = 1;
            } else {
                flag = 0;
                sb.append(sum);
            }
        }

        if (flag == 1) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }
}
