package labwork.block2.theme11.number4;

import static java.lang.Math.sqrt;

public class Triangle extends Shape implements Comparable {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

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

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is " + this.calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if (this.calculateArea() > triangle.calculateArea()) {
            return 1;
        }
        if (this.calculateArea() < triangle.calculateArea()) {
            return -1;
        }

        return 0;
    }

    public static Triangle parseTriangle(String string) throws InvalidShapeStringException{
        String[] arrayOfProperties = string.split(":");
        if (!arrayOfProperties[2].matches("[0-9]+,[0-9]+,[0-9]+")) {
            throw  new InvalidShapeStringException();
        } else {
            String[] arrayOfTriangleDimensions = arrayOfProperties[2].split(",");
            Triangle triangle = new Triangle(arrayOfProperties[1],
                    Double.parseDouble(arrayOfTriangleDimensions[0]),
                    Double.parseDouble(arrayOfTriangleDimensions[1]),
                    Double.parseDouble(arrayOfTriangleDimensions[2]));
            return triangle;
        }
    }
}
