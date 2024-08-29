package com.kirkwang.Codility;

import org.testng.Assert;

/**
 * Created by kewang on 11/8/17.
 * <p>
 * https://codility.com/programmers/lessons/1-iterations/binary_gap/
 * <p>
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation
 * 10000010001 and so its longest binary gap is of length 5.
 */
public class BinaryGap {

    public static void main(String[] args) {

        Assert.assertEquals(BinaryGap_toCharArry(1041), 5);
        Assert.assertEquals(BinaryGap_toCharArry(1001), 2);
        Assert.assertEquals(BinaryGap_toCharArry(20), 1);
        Assert.assertEquals(BinaryGap_toCharArry(15), 0);
        Assert.assertEquals(BinaryGap_toCharArry(32), 0);
    }

    public static int BinaryGap_toCharArry(int N) {
        String binaryFormat = Integer.toBinaryString(N);

        int distance = 0;
        int result = 0;
        for (int i = 0; i < binaryFormat.length(); i++) {
            if (binaryFormat.charAt(i) == '0') {
                distance++;
            } else if (distance > 0) {
                result = Math.max(distance, result);
                distance = 0;
            }

        }
        return result;
    }
}
