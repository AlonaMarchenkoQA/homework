package com.playtika.courses.homework8;

//Задача 8
//
//        Разработать программу, читающую переданный ей текстовый файл в параметрах.
//        Программа должна разбить данные текстового файла на слова, посчитать кол-во каждого слова,
//        и вывести слово и кол-во его вхождений в алфавитном порядке (без учета регистра!).
//
//        java ….SomeClass c:\file.txt
//        в - 10
//        да - 5
//        дерево - 2


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {

        try {
            WordsCounter wordsCounter = new WordsCounter();
            Files.lines(Paths.get(args[0]))
                    .forEach( line -> wordsCounter.append(line));
            wordsCounter.printWords();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
