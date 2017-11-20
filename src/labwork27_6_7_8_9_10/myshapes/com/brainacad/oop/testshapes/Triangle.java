package labwork27_6_7_8_9_10.myshapes.com.brainacad.oop.testshapes;

import static java.lang.Math.*;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double area;
        double s = (a + b + c) / 2;
        area = sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

    @Override
    public String toString() {
        return "This is Triangle, " +
                "color is " + color +
                ", a = " + a +
                ", b = " + b +
                ", c = " + c;
    }
}
