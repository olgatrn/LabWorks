package labwork.block2.theme08;

import static java.lang.Math.PI;

public class Circle extends Shape implements Comparable {
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

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is " + this.calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calculateArea() > circle.calculateArea()) {
            return 1;
        }
        if (this.calculateArea() < circle.calculateArea()) {
            return -1;
        }
        return 0;
    }
}
