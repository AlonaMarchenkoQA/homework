package com.playtika.courses.homework2;

//Задача 2.
//        Есть целое положительное число (long).
//        Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.
//
//        У числа 15875:
//        Наименьшее число: 1
//        Наибольшее число: 8

public class Task2 {
    public static void main(String[] args) {
        calculateMinMaxValue(15875);
    }

    private static void calculateMinMaxValue(long number){
        long minValue = 10;
        long maxValue = -1;

        while (number != 0) {
            long currentValue = number % 10;
            minValue = Math.min(minValue, currentValue);
            maxValue = Math.max(maxValue, currentValue);
            number /= 10;
        }
        System.out.printf("Наименьшая цифра %d\nНаибольшая цифра %d", minValue, maxValue);
    }
}
