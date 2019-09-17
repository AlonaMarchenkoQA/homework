package com.playtika.courses.homework4;

import java.util.Arrays;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    private float disAB;
    private float disBC;
    private float disCA;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.disAB = this.a.distance(this.b);
        this.disBC = this.b.distance(this.c);
        this.disCA = this.c.distance(this.a);
    }

    public float perimeter() {
        return this.disAB + this.disBC + this.disCA;
    }

    public float square() {
        float p = (this.disAB + this.disBC + this.disCA) / 2;
        return (float) Math.sqrt(p * (p - this.disAB) * (p - this.disBC) * (p - this.disCA));
    }

    public String type() {
        float[] sides = {this.disAB, this.disBC, this.disCA};
        Arrays.sort(sides);

        if(sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
            return "Прямоугольный";
        } else if(this.disAB == this.disBC && this.disBC == this.disCA) {
            return "Раносторонний";
        } else if(this.disAB == this.disBC || this.disBC == this.disCA || this.disCA == this.disAB) {
            return "Равнобедренный";
        } else {
            return "Произвольный";
        }
    }

    @Override
    public String toString() {
        return String.format("Треугольник[a%s b%s c%s]", this.a, this.b, this.c);
    }
}
