package labwork27_6_7_8_9_10.myshapes.com.brainacad.oop.testshapes;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "This is Shape, " +
                "color is " + color;
    }
}
