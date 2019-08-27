package com.playtika.courses.homework3;

//Задача 1.
//        Пользователь вводит последовательность символов.
//        Программа должна определить, является ли последовательность палиндромом.
//        Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.

import java.util.Scanner;

public class Task1 {

    private static boolean checkPolindrome(String word) {
        int checksCount = word.length() / 2;
        for(int i = 0; i < checksCount; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = scanner.nextLine();
        boolean isPolindrome = checkPolindrome(word);

        if(isPolindrome) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
