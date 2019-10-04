package com.playtika.courses.homework5.calculator;

public class Division implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        if (right == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return left / right;
    }
}

