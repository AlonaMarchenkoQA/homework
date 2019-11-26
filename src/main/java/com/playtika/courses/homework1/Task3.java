package com.playtika.courses.homework1;

//Задание 3.
//        Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет единичный вектор и выводит его на консоль.
//
//        Для нахождения единичного вектора, нужно посчитать длину исходного вектора и разделить каждую из координат на его длину.
//
//        Длина вектора - Math.sqrt(X * X + Y * Y + Z * Z)
//
//        Пример:
//        Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)

//лучше вынести расчеты в отдельный метод static void calculateVectorLength (double x, double y, double z)
public class Task3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;
        double len = Math.sqrt(x * x + y * y + z * z);
        double uvx = x / len;
        double uvy = y / len;
        double uvz = z / len;

        System.out.printf("Единичный вектор для вектора (%d, %d, %d) => (%f, %f, %f)", x, y, z, uvx, uvy, uvz);
    }
}
