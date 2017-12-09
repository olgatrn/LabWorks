package labwork.block2.theme11.number4;

import static java.lang.Math.PI;

public class Circle extends Shape implements Comparable {
    private double radius;

    public Circle() {
        this.color = "black";
        this.radius = 1;
    }

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

    public static Circle parseCircle(String string) throws InvalidShapeStringException{
        String[] arrayOfProperties = string.split(":");
        if (!arrayOfProperties[2].matches("[0-9]+(\\.[0-9]+)?")) {
            throw  new InvalidShapeStringException();
        } else {
            Circle circle = new Circle(arrayOfProperties[1],
                    Double.parseDouble(arrayOfProperties[2]));
            return circle;
        }
    }
}
