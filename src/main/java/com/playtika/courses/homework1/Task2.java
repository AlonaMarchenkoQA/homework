package com.playtika.courses.homework1;

//Задание 2.
//        Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, слева-направо. Число задается в параметре статического метода.
//        Каждую цифру вывести в отдельной строке.
//        45685
//        4
//        5
//        6
//        8
//        5

public class Task2 {

    public static void main(String[] args) {
        int number = 45685;
        for (int i = 10000; i > 0; i /= 10) {
            int n = number / i;
            number = number % i;
            System.out.println(n);
        }
    }
}
