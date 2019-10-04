package com.playtika.courses.homework5.calculator;

public class Addition implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left + right;
    }

}
