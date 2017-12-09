package labwork.block2.theme02;

class A {
    public float calculateSquare(float width, float height) {
        float squareOfRectangle = width * height;
        return squareOfRectangle;
    }

    public float calculateSquare(float width) {
        float squareOfFoursquare = width * width;
        return squareOfFoursquare;
    }

    public double calculateSquare(double radius) {
        double squareOfCircle = 3.1415926535 * radius * radius;
        return squareOfCircle;
    }
}

public class LabWork225 {
    public static void main(String... args) {
        A a = new A();
        System.out.println(a.calculateSquare(25f, 4.5f));
        System.out.println(a.calculateSquare(20.5));
        System.out.println(a.calculateSquare(20f));
    }
}
