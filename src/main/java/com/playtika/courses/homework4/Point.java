package com.playtika.courses.homework4;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distance(Point pointTo) {
        float deltaX = this.x - pointTo.x;
        float deltaY = this.y - pointTo.y;

        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return String.format("(%f;%f)", this.x, this.y);
    }
}
