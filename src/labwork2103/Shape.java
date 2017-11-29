package labwork2103;

public abstract class Shape implements Drawable {
    protected String color;

    public Shape() {
        this.color = "black";
    }

    public Shape(String color) {
        this.color = color;
    }

    public static Shape parseShape(String string) {
        String[] arrayOfProperties = string.split(":");

//        excess code
//        Scanner scanner1 = new Scanner(string);
//        String dimensions = scanner1.findInLine("\\d+(,\\d+){0,2}");
//        int numberOfDimensions = 0;
//        StringTokenizer stringTokenizer = new StringTokenizer(dimensions, ",");
//        while (stringTokenizer.hasMoreElements()) {
//            numberOfDimensions++;
//        }
//        Scanner scanner2 = new Scanner(dimensions).useDelimiter(",");
//        while (scanner2.hasNext()) {
//            numberOfDimension++;
//        }
//        System.out.println(numberOfDimensions);

        switch (arrayOfProperties[0]) {
            case "Rectangle":
                return Rectangle.parseRectangle(string);
            case "Triangle":
                return Triangle.parseTriangle(string);
            case "Circle":
                return Circle.parseCircle(string);
            default:
                return null;
        }
    }

//    private static Rectangle getRectangle(String string) {
//        String[] arrayOfProperties = string.split(":");
//        String[] arrayOfRectangleDimensions = arrayOfProperties[2].split(",");
//        Rectangle rectangle = new Rectangle(arrayOfProperties[1],
//                Double.parseDouble(arrayOfRectangleDimensions[0]),
//                Double.parseDouble(arrayOfRectangleDimensions[1]));
//        return rectangle;
//    }
//
//    private static Triangle getTriangle(String string) {
//        String[] arrayOfProperties = string.split(":");
//        String[] arrayOfTriangleDimensions = arrayOfProperties[2].split(",");
//        Triangle triangle = new Triangle(arrayOfProperties[1],
//                Double.parseDouble(arrayOfTriangleDimensions[0]),
//                Double.parseDouble(arrayOfTriangleDimensions[1]),
//                Double.parseDouble(arrayOfTriangleDimensions[2]));
//        return triangle;
//    }
//
//    private static Circle getCircle(String string) {
//        String[] arrayOfProperties = string.split(":");
//        Circle circle = new Circle(arrayOfProperties[1],
//                Double.parseDouble(arrayOfProperties[2]));
//        return circle;
//    }

    public double calculateArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "This is Shape, " +
                "color is " + color;
    }
}
