package com.playtika.courses.homework5.calculator;

public class Root implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        if (right <= 0){
            throw new RuntimeException("Incorrect argument: " + right);
        }
        return Math.pow(left, 1.0 / right);
    }
}