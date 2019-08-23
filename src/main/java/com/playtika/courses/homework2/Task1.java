package com.playtika.courses.homework2;

//Задача 1.
//        Напишите программу, в которой задаются данные(строки):
//        имя, фамилия и отчество и  выводящую эти  данные в следующем виде:
//
//        ********************************
//        *        Курс: Java core       *
//        *            Студент           *
//        *              ФИО             *
//        ********************************
//        Необходимо, чтобы программа сама определяла нужную длину рамки.
//        Сама же длина рамки зависит от длины наибольшей строки внутри рамки.
//        Используя циклы for легко можно выровнять стороны рамки.

import java.util.Scanner;

public class Task1 {
    private static final char BORDER_SYMBOL = '*';
    private static final String COURSE_LABEL = "Курс: Java core";
    private static final String STUDENT = "Студент";

    private static void printBorderLine(int len) {
        for (int i = 0; i < len + 2; i++) {
            System.out.print(BORDER_SYMBOL);
        }
        System.out.println();
    }

    private static void printLabel(String name, int len) {
        int symbolsBeforeLastIndex = (len - name.length()) / 2;
        int symbolsAfterFirstIndex = symbolsBeforeLastIndex + name.length();

        System.out.print(BORDER_SYMBOL);
        for (int i = 0; i < len; i++) {
            if (i < symbolsBeforeLastIndex || i >= symbolsAfterFirstIndex) {
                System.out.print(" ");
            } else {
                System.out.print(name);
                i += name.length() - 1;
            }
        }
        System.out.println(BORDER_SYMBOL);
    }

    public static void main(String[] args) {
        System.out.println("Введите ФИО:");
        String studentName = new Scanner(System.in).nextLine();

        int maxLine = Math.max(COURSE_LABEL.length(), STUDENT.length());
        maxLine = Math.max(maxLine, studentName.length());
        maxLine += 2;

        printBorderLine(maxLine);
        printLabel(COURSE_LABEL, maxLine);
        printLabel(STUDENT, maxLine);
        printLabel(studentName, maxLine);
        printBorderLine(maxLine);
    }
}