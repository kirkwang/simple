package com.kirkwang.easy;



/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median
of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

import java.util.Arrays;

class MergeArrayFindMedian {

    public static void main(String[] args) {
        int[] one = {1, 2};
        int[] two = new int[] {3};

        MergeArrayFindMedian mc = new MergeArrayFindMedian();
        for (int i : mc.mergTwoArray(one, two)) {
            System.out.println(i);
        }

        int[] meraged = mc.mergTwoArray(one, two);
        double result = mc.findMedian(meraged);
        System.out.println("average " + result);

    }

    public int[] mergTwoArray(int[] one, int[] two) {
        int[] mergedArray = new int[one.length + two.length];
        int index = 0;
        for (int i = 0; i < one.length; i++) {
            mergedArray[i] = one[i];
            index++;
        }

        for (int i = 0; i < two.length; i++) {
            mergedArray[index++] = two[i];
        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public double findMedian(int[] input) {
        //Explanation: merged array = [1,2,3] and median is 2.

        double answer = 0.0;
        if (input.length % 2 != 0) {
            //if it is odd length then get middle element
            answer = (float) input[(input.length - 1) / 2];
        } else {
            int right = input[input.length / 2]; // [1,2,3,4] right = 3
            int left = input[(input.length - 1) / 2]; // [1,2,3,4] left = 2
            answer = (float) (left + right) / 2;
        }

        return answer;
    }
}