package com.leetcode.easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogCounter {

    public static void main(String[] args) {
        LogCounter logCounter = new LogCounter();
        List<String> allLines = logCounter.fileReader("resources/file.log");
        Map<String, String[]> mMap = logCounter.buildMap(allLines);
        for (String[] s : mMap.values()) {
            System.out.println(
                    "The " + s[0] + " has visited " + s[1] + " times. The average process time is "
                            + Integer.parseInt(s[3]) / Integer.parseInt(
                            s[1]) + " , and average wait time is " + Integer.parseInt(s[4]) / Integer.parseInt(
                            s[1]));

        }
    }

    public List<String> fileReader(String s) {
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get(s));
            allLines.remove(0); //remove headers
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }

    public Map<String, String[]> buildMap(List<String> input) {
        HashMap<String, String[]> myMap = new HashMap<>();
        //111.222.333.123 , HOME , [01/Feb/1998:01:08:39 -0800] , 2 , 4;
        for (String line : input) {
            String[] chopped = line.split(",");

            if (myMap.containsKey(chopped[0])) {
                String[] temp = myMap.get(chopped[0]);
                temp[1] = String.valueOf(Integer.parseInt(temp[1]) + 1);

                temp[3] = String.valueOf(
                        Integer.parseInt(temp[3].trim()) + Integer.parseInt(chopped[3].trim()));
                temp[4] = String.valueOf(
                        Integer.parseInt(temp[4].trim()) + Integer.parseInt(chopped[4].trim()));
                myMap.put(chopped[0], temp);
            } else {
                chopped[1] = "1";
                myMap.put(chopped[0], chopped);
            }
        }
        return myMap;
    }
}
