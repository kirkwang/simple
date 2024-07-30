/*
 * 4/25/19 10:37 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.medium;
/*
Example 1:

Input: cpdomains = ["9001 discuss.leetcode.com"]
Output: ["9001 leetcode.com","9001 discuss.leetcode.com","9001 com"]
Explanation: We only have one website domain: "discuss.leetcode.com".
As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.
Example 2:

Input: cpdomains = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
Explanation: We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.

 */

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SubdomainVisitCount {
    public static void main(String[] args) {

        String[] input = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        System.out.println(SubdomainVisitCount.subdomainVisits(input));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] domainSplit = cpdomain.split(" ");
            int count = Integer.parseInt(domainSplit[0]);
            String domain = domainSplit[1];

            int index = 0;
            do {
                String subdomain = domain.substring(index); //something.domain.com has index 0.1.2 as on line 32
                hashMap.put(subdomain, hashMap.getOrDefault(subdomain, 0) + count);
                index = domain.indexOf(".", index); //index has begin index or start index

            } while (index++ >= 0);
        }
        return hashMap.entrySet().stream().map(stringIntegerEntry -> (stringIntegerEntry.getValue() + " " + stringIntegerEntry.getKey())).collect(Collectors.toList());
    }
}
