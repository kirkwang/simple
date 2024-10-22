package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

 */
public class CountCharacters {


    public static int countCharacters(String[] words, String chars) {
        int[] map = new int[26];

        int result = 0;
        for (int i = 0; i < chars.length(); i++) {
            map[chars.charAt(i) - 'a']++;
        }

        for (String s : words) {
            int[] tempMap = map.clone();
            boolean flag = true;
            for (int i = 0; i < s.length(); i++) {

                if (tempMap[s.charAt(i) - 'a'] == 0) {
                    flag = false;
                    break;
                } else {
                    tempMap[s.charAt(i) - 'a']--;
                }
            }
            if (flag) result = result + s.length();
        }


        return result;
    }

    public static int countCharacters_leetcode(String[] words, String chars) {
        int[] map = new int[26];
        int res = 0;

        for (int i = 0; i < chars.length(); i++) {
            map[chars.charAt(i) - 'a']++;
        }

        for (String word : words) {
            int[] tempMap = map.clone();
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (tempMap[word.charAt(i) - 'a'] == 0) {
                    flag = false;
                    break;
                } else {
                    tempMap[word.charAt(i) - 'a']--;
                }
            }
            if (flag) res += word.length();
        }

        return res;
    }

    public static void main(String[] args) {
        // some of the test cases are not working.
        String[] words = {"cat", "bt", "hat", "tree"};
        int result;
        result = countCharacters(words, "atach");
        Assert.assertEquals(result, 6);

        words = new String[]{"hello", "world", "leetcode"};
        result = countCharacters(words, "welldonehoneyr");
        Assert.assertEquals(result, 10);

        words = new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin", "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb", "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl", "boygirdlggnh", "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx", "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop", "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx", "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo", "oxgaskztzroxuntiwlfyufddl", "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp", "qnagrpfzlyrouolqquytwnwnsqnmuzphne", "eeilfdaookieawrrbvtnqfzcricvhpiv", "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz", "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue", "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv", "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo", "teyygdmmyadppuopvqdodaczob", "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs", "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        result = countCharacters(words, "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp");
        Assert.assertEquals(result, 0);


    }
}
