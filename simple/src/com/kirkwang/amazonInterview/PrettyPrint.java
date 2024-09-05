/*
 * 4/2/19 4:41 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

/*
https://www.careercup.com/question?id=5757179223080960
 */
public class PrettyPrint {
    public static void main(String[] args) {
        String input = "Sea!tle is a nice place. Work Hard! have Fun, make HIStory!";
        new PrettyPrint().prettyPrint(input);
    }

    public void prettyPrint(String input) {
        String[] spaceSplit = input.split(" ");
        for (int i = 0; i < spaceSplit.length; i++) {
            String word = spaceSplit[i];
            int lastIndex = word.length() - 1;
            if (word.charAt(lastIndex) == '!' || word.charAt(lastIndex) == ',' || word.charAt(lastIndex) == '.') {
                //it will remove the last char and append . at the end.
                String sb = word.substring(0, lastIndex) + ".";
                spaceSplit[i] = sb.toLowerCase();
            }
        }
        StringBuilder sentence = new StringBuilder();
        for (String string : spaceSplit) {
            sentence = sentence.append(string).append(" ");

            String firstChar = String.valueOf(sentence.charAt(0));
            sentence.setCharAt(0, firstChar.toUpperCase().toCharArray()[0]);

            char lastChar = string.charAt(string.length() - 1);
            if (lastChar == '.') {
                System.out.println(sentence.toString().replace('!', 't'));
                sentence = new StringBuilder();
            }

        }
    }

}
