package com.playtika.courses.homework5.calculator;

public class Multiplication implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left * right;
    }
}
