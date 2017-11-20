package labwork28_1_2_3_4_5.myshapes.com.brainacad.oop.testshapes;

public class Rectangle extends Shape implements Comparable {
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

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is " + this.calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calculateArea() > rectangle.calculateArea()) {
            return 1;
        }
        if (this.calculateArea() < rectangle.calculateArea()) {
            return -1;
        }
        return 0;
    }
}
