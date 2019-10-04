package com.playtika.courses.homework5.calculator;

public class Parser {

    public ParserData parse(String input) throws Exception {
        String[] data = input.split(" ");

        if (data.length == 3) {
            double left = Double.valueOf(data[0]);
            BinaryOperation operator = getOperationFor(data[1]);
            double right = Double.valueOf(data[2]);

            return new ParserData(left, right, operator);
        }
        throw new Exception("Invalid data: " + input);
    }

    private BinaryOperation getOperationFor(String operator) throws Exception {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Substraction();
        } else if ("+".equals(operator)) {
            return new Addition();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)) {
            return new Exponentiation();
        } else if ("sqrt".equals(operator)) {
            return new Root();
        } else if ("log".equals(operator)) {
            return new Logarithm();
        }
        throw new Exception("Invalid operation " + operator);
    }
}
