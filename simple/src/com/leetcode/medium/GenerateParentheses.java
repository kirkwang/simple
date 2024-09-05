package com.leetcode.medium;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kewang on 12/14/17.
 *
 * <p><a href="https://leetcode.com/problems/generate-parentheses/description/">...</a>
 */
public class GenerateParentheses {

    public static void main(String[] args) {

        Assert.assertEquals(GenerateParentheses(1).toString(), "[()]");
        Assert.assertEquals(GenerateParentheses(2).toString(), "[(()), ()()]");
        Assert.assertEquals(GenerateParentheses(3).toString(), "[((())), (()()), (())(), ()(()), ()()()]");
    }

    public static List<String> GenerateParentheses(int count) {
        List<String> list = new ArrayList<>();
        generater("", list, count, count);

        return list;
    }

    public static void generater(String str, List<String> sublist, int left, int right) {

        if (left > right) {
            return;
        }
        if (left > 0) {
            generater(str + "(", sublist, left - 1, right);
        }
        if (right > 0) {
            generater(str + ")", sublist, left, right - 1);
        }
        if (left == 0 && right == 0) {
            sublist.add(str);
        }
    }
}
