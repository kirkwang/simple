package com.kirkwang.HackerRank;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;

/**
 * Created by kewang on 11/1/17.
 */
public class QuestionTwo {
    /*
    * This method is base on user who aware of the data model
    * */
    private static String json = "{\n" +
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

    public static void main(String[] args) throws ParseException {

        JSONParser parser = new JSONParser();
        JSONObject jsonObj = (JSONObject) parser.parse(json);

        JSONArray bookArray = (JSONArray) jsonObj.get("books");
        Iterator i = bookArray.iterator();
        Book[] bArray = new Book[bookArray.size()];
        int counter = 0;
        while (i.hasNext()) {
            JSONObject aJBook = (JSONObject) i.next();
            Book abook = new Book();

            String title = (String) aJBook.get("title");
            abook.setTitle(title);
            String author = (String) aJBook.get("author");
            abook.setAuthor(author);
            JSONArray genresArray = (JSONArray) aJBook.get("genres");
            String[] arr = new String[genresArray.size()];
            for (int index = 0; index < arr.length; index++) {
                arr[index] = (String) genresArray.get(index);
            }
            bArray[counter++] = abook;
        }
        //The bArray has transformed into a list of Book object
        //We can loop the loop by book object instead of JSON object
        System.out.println(" book array length " + bArray.length);

        //The output is
        // book array length 2
    }

    public static class Book {
        private String title;
        private String author;
        private String[] genres;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String[] getGenres() {
            return genres;
        }

        public void setGenres(String[] genres) {
            this.genres = genres;
        }
    }

}
