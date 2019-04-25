/*
 * 4/25/19 10:37 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {
    public static void main(String[] args) {

        String[] input = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        System.out.println(subdomainVisits(input));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] domainSplit = cpdomains[i].split(" ");
            int count = Integer.valueOf(domainSplit[0]);
            String domain = domainSplit[1];

            int index = 0;
            while (true) {
                String subdomain = domain.substring(index); //something.domain.com has index 0.1.2 as on line 32
                hashMap.put(subdomain, hashMap.getOrDefault(subdomain, 0) + count);
                index = domain.indexOf(".", index); //index has begin index or start index
                if (index++ < 0) {
                    break;
                }
                // index++;
            }
        }

        return new ArrayList<>();
    }
}
