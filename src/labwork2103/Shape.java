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
                String[] arrayOfRectangleDimensions = arrayOfProperties[2].split(",");
                return new Rectangle(arrayOfProperties[1],
                        Double.parseDouble(arrayOfRectangleDimensions[0]),
                        Double.parseDouble(arrayOfRectangleDimensions[1]));
            case "Triangle":
                String[] arrayOfTriangleDimensions = arrayOfProperties[2].split(",");
                return new Triangle(arrayOfProperties[1],
                        Double.parseDouble(arrayOfTriangleDimensions[0]),
                        Double.parseDouble(arrayOfTriangleDimensions[1]),
                        Double.parseDouble(arrayOfTriangleDimensions[2]));
            case "Circle":
                return new Circle(arrayOfProperties[1],
                        Double.parseDouble(arrayOfProperties[2]));
            default:
                return null;
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
