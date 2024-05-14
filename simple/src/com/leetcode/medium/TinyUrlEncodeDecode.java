/*
 * 3/24/19 11:42 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.medium;

import java.util.HashMap;

public class TinyUrlEncodeDecode {
    static String BASE_HOST = "http://tinyurl.com/";
    static String SEED = "ABCDEFGHIJKLMNOPQRETUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static HashMap<String, String> keyToUrl = new HashMap();
    static HashMap<String, String> urlToKey = new HashMap();


    public static String encodeUrl(String longUrl) {
        if (urlToKey.containsKey(longUrl)) {
            return urlToKey.get(longUrl);
        }
        String key = null;

        do {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int code = (int) (Math.random() * SEED.length());
                temp.append(SEED.charAt(code));
            }
            key = temp.toString();

        }
        while (keyToUrl.containsKey(key));
        keyToUrl.put(key, longUrl);
        urlToKey.put(longUrl, key);

        return BASE_HOST + key;
    }

    public static void main(String[] args) {
        String input = "http://cnn.com";

        String output = TinyUrlEncodeDecode.encodeUrl(input);
        System.out.println("encode url " + output);
        System.out.println("decode url " + keyToUrl.get(output.replaceAll(BASE_HOST, "")));
    }
}
