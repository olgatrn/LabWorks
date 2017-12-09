package labwork.block2.theme07.number678910;

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
