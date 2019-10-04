package com.playtika.courses.homework5.calculator;

public class ParserData {

    double left;
    double right;
    BinaryOperation operator;

    public ParserData(double left, double right, BinaryOperation operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
}
