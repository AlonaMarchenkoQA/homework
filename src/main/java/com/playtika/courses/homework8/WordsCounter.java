package com.playtika.courses.homework8;

import java.util.Map;
import java.util.TreeMap;

public class WordsCounter {

    private Map<String, Integer> wordsCount = new TreeMap<>();

    public void append(String str) {
        String[] words = str.split(" ");

        for (String word : words) {
            String key = word.toLowerCase();
            Integer count = wordsCount.get(key);
            if (count == null) {
                wordsCount.put(key, 1);
            } else {
                wordsCount.put(key, count + 1);
            }
        }
    }

    public void printWords() {
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }
}
