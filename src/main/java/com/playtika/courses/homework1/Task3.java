package com.playtika.courses.homework1;

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
