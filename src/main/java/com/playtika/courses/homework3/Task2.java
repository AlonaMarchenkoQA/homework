package com.playtika.courses.homework3;

//Задача 2.
//        Пользователь вводит строку.
//        Программа разбивает строку на слова, и “переворачивает” каждое слово,
//        формирует из новых слов предложение и выводит его на экран.

import java.util.Scanner;

public class Task2 {
    private static String makeSentence(String sentence) {
        String[] words = sentence.split(" ");
        String[] newSentence = new String[words.length];
        for(int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            String newWord = reverseWord(currentWord);
            newSentence[i] = newWord;
        }
        String result = String.join(" ", newSentence);
        return result;
    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--) {
            char symbol = word.charAt(i);
            sb.append(symbol);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();
        String newSentence = makeSentence(sentence);

        System.out.println(newSentence);
    }
}
