package com.playtika.courses.homework1;

public class Task2 {

    public static void main(String[] args) {
        int number = 15783;
        for (int i = 10000; i > 0; i /= 10) {
            int n = number / i;
            number = number % i;
            System.out.println(n);
        }
    }
}
