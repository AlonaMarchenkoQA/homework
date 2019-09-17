package com.playtika.courses.homework4;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public Triangle[] generate(int count) {
        Triangle[] triangles = new Triangle[count];
        for(int i = 0; i < count; i++) {
            Point pointA = new Point(getRandomFloat(), getRandomFloat());
            Point pointB = new Point(getRandomFloat(), getRandomFloat());
            Point pointC = new Point(getRandomFloat(), getRandomFloat());
            Triangle triangle = new Triangle(pointA, pointB, pointC);
            if(triangle.square() > 0) {
                triangles[i] = triangle;
            } else {
                i--;
            }
        }
        return triangles;
    }

    private float getRandomFloat() {
        return ThreadLocalRandom.current().nextFloat();
    }
}
