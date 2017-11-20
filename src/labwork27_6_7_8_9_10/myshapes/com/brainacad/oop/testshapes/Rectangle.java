package labwork27_6_7_8_9_10.myshapes.com.brainacad.oop.testshapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "This is Rectangle, " +
                "color is " + color +
                ", width = " + width +
                ", height = " + height;
    }
}
