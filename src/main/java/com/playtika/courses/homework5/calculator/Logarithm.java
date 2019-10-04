package com.playtika.courses.homework5.calculator;

public class Logarithm implements BinaryOperation {

    public double resultFor(double left, double right) {
        return Math.log(right) / Math.log(left);
    }
}
