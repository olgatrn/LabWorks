package labwork.block2.theme07.number678910;

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
