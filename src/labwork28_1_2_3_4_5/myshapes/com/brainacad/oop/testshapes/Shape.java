package labwork28_1_2_3_4_5.myshapes.com.brainacad.oop.testshapes;

public abstract class Shape implements Drawable {
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
