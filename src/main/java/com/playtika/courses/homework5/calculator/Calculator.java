package com.playtika.courses.homework5.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        Parser parser = new Parser();
        try {
            ParserData data = parser.parse(expression);
            double result = data.operator.resultFor(data.left, data.right);
            System.out.printf("%s = %s", expression, result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
