package labwork.block2.theme07.number678910;

import static java.lang.Math.*;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "This is Circle, " +
                "color is " + color +
                ", radius = " + radius;
    }
}
