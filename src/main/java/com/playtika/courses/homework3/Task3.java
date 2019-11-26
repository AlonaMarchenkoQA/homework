package com.playtika.courses.homework3;

//Задача 3.
//        Пользователь задает длину массива (положительное число от 10 до 100).
//        Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {

    private static int[] createArrayWithRandomNumbers(int len) {
        int[] randomNumbers = new int[len];

        for(int i = 0; i < len; i++) {
            // как вариант, вместо ThreadLocalRandom, можно использовать класс Random
            int randomNumber = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
            randomNumbers[i] = randomNumber;
        }
        return randomNumbers;
    }

    private static void printArray(int[] mas) {
        StringBuilder sb = new StringBuilder();
        sb.append("Исходный массив:");
        for(int i = 0; i < mas.length; i++) {
            sb.append(" ");
            sb.append(mas[i]);
        }
        System.out.println(sb.toString());
    }

    private static void printMultiplesOfThreeArray(int[] mas) {
        StringBuilder sb = new StringBuilder();
        sb.append("Числа, кратные 3:");
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] % 3 ==0) {
                sb.append(" ");
                sb.append(mas[i]);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива (положительное число от 10 до 100):");
        int len = scanner.nextInt();
        if(len < 10 || len > 100) {
            System.out.println("Число должно быть от 10 до 100");
        } else {
            int[] m = createArrayWithRandomNumbers(len);
            printArray(m);
            printMultiplesOfThreeArray(m);
        }
    }
}
