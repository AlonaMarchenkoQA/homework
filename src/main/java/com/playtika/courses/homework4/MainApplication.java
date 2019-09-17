package com.playtika.courses.homework4;

import java.util.Scanner;

public class MainApplication {
    private static final int TRIANGLES_COUNT = 100000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Генерация %d треугольников…\n", TRIANGLES_COUNT);

        Generator generator = new Generator();
        Triangle[] triangles = generator.generate(TRIANGLES_COUNT);

        System.out.println("Выберите класс треугольника для поиска:\n" +
                "1. Равнобедренный\n" +
                "2. Равносторонний\n" +
                "3. Прямоугольный\n" +
                "4. Произвольный\n");

        int number = scanner.nextInt();
        String type = null;
        switch (number) {
            case 1:
                type = "Равнобедренный";
                break;
            case 2:
                type = "Равносторонний";
                break;
            case 3:
                type = "Прямоугольный";
                break;
            case 4:
                type = "Произвольный";
                break;
        }

        for(int i = 0; i < TRIANGLES_COUNT; i++) {
            Triangle triangle = triangles[i];
            if(triangle.type().equals(type)) {
                System.out.printf("Найден %s треугольник.\nИндекс: %d\n %s\nПериметр: %f\nПлощадь: %f\n",
                        type, i, triangle, triangle.perimeter(), triangle.square());
                System.exit(0);
            }
        }

        System.out.println("Треугольник не найден");
    }
}
