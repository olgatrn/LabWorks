package labwork2114;

public abstract class Shape implements Drawable {
    protected String color;

    public Shape() {
        this.color = "black";
    }

    public Shape(String color) {
        this.color = color;
    }

    public static Shape parseShape(String string) throws InvalidShapeStringException {

        String[] arrayOfProperties = string.split(":");

        if (arrayOfProperties.length != 3) {
            throw new InvalidShapeStringException();
        } else if (!arrayOfProperties[1].matches("[A-Z]+|[a-z]+|[A-Z][a-z]+")) {
            throw new InvalidShapeStringException();
        } else {
            switch (arrayOfProperties[0]) {
                case "Rectangle":
                    return Rectangle.parseRectangle(string);
                case "Triangle":
                    return Triangle.parseTriangle(string);
                case "Circle":
                    return Circle.parseCircle(string);
                default:
                    throw new InvalidShapeStringException();
            }
        }
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
