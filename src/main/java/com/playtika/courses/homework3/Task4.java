package com.playtika.courses.homework3;

//Задача 4.
//        Программа запрашивает у пользователя ФИО, мобильный телефон и email,
//        и проверяет данные на валидность с помощью регулярных выражений.
//        ФИО - только буквы английского  алфавита, дефис и пробел
//        Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
//        email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и .
//        Проверить все вводимые данные и вывести неверно введенные.

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4 {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z-\\s]+$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\+380(66|67|97|96|98|93)\\d{7}$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-]+@[\\w-]+\\.[\\w]+$");

    private static boolean checkValidName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    private static boolean checkValidPhoneNumber(String number) {
        return PHONE_PATTERN.matcher(number).matches();
    }

    private static boolean checkValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your full name:");
        String name = scanner.nextLine();
        System.out.println("Please, enter your cellphone number with code (+380):");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please, enter your email:");
        String email = scanner.nextLine();

        boolean isValidName = checkValidName(name);
        boolean isValidPhoneNumber = checkValidPhoneNumber(phoneNumber);
        boolean isValidEmail = checkValidEmail(email);

        if(!isValidName) {
            System.out.printf("Invalid data: %s\n", name);
        }
        if(!isValidPhoneNumber) {
            System.out.printf("Invalid data: %s\n", phoneNumber);
        }
        if(!isValidEmail) {
            System.out.printf("Invalid data: %s\n", email);
        }
    }
}
