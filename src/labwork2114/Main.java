package labwork2114;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shapeFirst = new Rectangle();
        Shape shapeSecond = new Triangle();
        Shape shapeThird = new Circle();
        try {
            shapeFirst = Shape.parseShape("Rectangle:red:45,67");
            shapeSecond = Triangle.parseTriangle("Triangle:red:45,23,12");
            shapeThird = Circle.parseCircle("Circle:red:34");
        } catch (InvalidShapeStringException e) {
            System.out.println("Parsing error, another values needed.");
        } finally {
            System.out.println(shapeFirst);
            System.out.println(shapeSecond);
            System.out.println(shapeThird);
        }
        System.out.println("Enter the string for parsing a new shape:");
        String string = new Scanner(System.in).nextLine();
        try {
            Shape shapeFromConsole = Shape.parseShape(string);
        } catch (InvalidShapeStringException e) {
            System.out.println("Parsing error, another values needed.");
        }
        System.out.println();
    }
}

