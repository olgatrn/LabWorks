package labwork.block2.theme10.number_3_4_5;

public class Rectangle extends Shape implements Comparable {
    private double width;
    private double height;

    public Rectangle() {
        this.color = "black";
        this.width = 1;
        this.height = 1;
    }

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

    public static Rectangle parseRectangle(String string) {
        String[] arrayOfProperties = string.split(":");
        String[] arrayOfRectangleDimensions = arrayOfProperties[2].split(",");
        Rectangle rectangle = new Rectangle(arrayOfProperties[1],
                Double.parseDouble(arrayOfRectangleDimensions[0]),
                Double.parseDouble(arrayOfRectangleDimensions[1]));
        return rectangle;
    }
}
