package com.kirkwang.HackerRank;

import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by kewang on 11/1/17.
 */
public class QuestionOne {
/*
* This method is base on the JSON Object access for case that user has no object model
* */

    public static void main(String[] args) throws IOException, ParseException {
        String json = "{\n" +
                "    \"books\" : [\n" +
                "        {\n" +
                "            \"title\" : \"Some title\",\n" +
                "            \"author\" : \"Some author\",\n" +
                "            \"genres\" : [\n" +
                "                \"thriller\",\n" +
                "                \"drama\"\n" +
                "             ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\" : \"Some other title\",\n" +
                "            \"author\" : \"Kirk\",\n" +
                "            \"genres\" : [\n" +
                "                \"comedy\",\n" +
                "                \"nonfiction\",\n" +
                "                \"thriller\"\n" +
                "             ]\n" +
                "         }\n" +
                "    ]\n" +
                " }";

        JSONParser parser = new JSONParser();
        JSONObject jsonObj = (JSONObject) parser.parse(json);

        JSONArray bookArray = (JSONArray) jsonObj.get("books");
        Iterator i = bookArray.iterator();
        while (i.hasNext()) {
            JSONObject aBook = (JSONObject) i.next();
            String title = (String) aBook.get("title");
            if (aBook.get("author").toString().toLowerCase().contains("kirk")) {
                //skip printing if the author is kirk
            } else {
                System.out.println(title);
            }
            JSONArray genresArray = (JSONArray) aBook.get("genres");
            if (genresArray.contains("comedy")) {
                //I'd like to know the author if it's comedy
                System.out.println(aBook.get("author"));
            }

        }
        /*
        * The out put is Some title
        * Kirk
        * */
    }
}
