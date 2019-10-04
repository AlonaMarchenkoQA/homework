package com.playtika.courses.homework7;

//Разработать программу, аналог grep :).
//        Программа ожидает 2 параметра на входе:
//        1.	 имя файла (относительное либо полный путь)
//        2.	строку/регулярное выражение
//        После программа выводить все строки (с номером строки в файле), в которых найдена строка либо регулярное выражение.
//
//        Если файл не найден, либо доступ к нему запрещен, программа выводит соответствующее сообщение.

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {

    private void run(Scanner scanner) {
        String[] args = scanner.nextLine().split(" ");
        if (args.length != 2) {
            System.out.println("Invalid arguments count");
            System.exit(1);
        }
        Pattern pattern = Pattern.compile(args[1]);

        try (FileReader fileReader = new FileReader(args[0]);
                LineNumberReader lineNumberReader = new LineNumberReader(fileReader)) {
            String line;
            while ((line = lineNumberReader.readLine()) != null) {
                if (pattern.matcher(line).find()) {
                    System.out.printf("[%d], %s\n", lineNumberReader.getLineNumber(), line);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run(new Scanner(System.in));

    }
}
