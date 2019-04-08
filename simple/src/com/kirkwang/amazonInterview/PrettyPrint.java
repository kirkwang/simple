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
                StringBuilder sb = new StringBuilder();
                sb.append(word, 0, lastIndex); //it will remove the last char and append . at the end.
                sb.append(".");
                spaceSplit[i] = sb.toString().toLowerCase();
            }
        }
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < spaceSplit.length; i++) {

            char lastChar = spaceSplit[i].charAt(spaceSplit[i].length() - 1);
            sentence = sentence.append(spaceSplit[i]).append(" ");
            String firstChar = String.valueOf(sentence.charAt(0));
            sentence.setCharAt(0, firstChar.toUpperCase().toCharArray()[0]);

            if (lastChar == '.') {
                System.out.println(sentence.toString().replace('!', 't'));
                sentence = new StringBuilder();
            }


        }
    }

}
