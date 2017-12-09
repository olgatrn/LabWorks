package labwork.block2.theme07.number678910;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("RED");
        System.out.println(shape.toString());
        System.out.println("Shape area is: " + shape.calculateArea());

        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle.toString());
        System.out.println("Shape area is: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle("RED", 11, 22);
        System.out.println(rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calculateArea());

        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle.toString());
        System.out.println("Shape area is: " + triangle.calculateArea());

        final int NUMBER_OF_RECTANGLES = 5;
        final int NUMBER_OF_CIRCLES = 2;
        final int NUMBER_OF_TRIANGLES = 2;
        Shape[] shapeObjects = new Shape[NUMBER_OF_RECTANGLES + NUMBER_OF_CIRCLES + NUMBER_OF_TRIANGLES];
        for (int i = 0; i < shapeObjects.length; i++) {
            if (i < NUMBER_OF_RECTANGLES) {
                shapeObjects[i] = new Rectangle("RED", 100 * random(), 100 * random());
            } else if (NUMBER_OF_RECTANGLES <= i & i < NUMBER_OF_RECTANGLES + NUMBER_OF_CIRCLES) {
                shapeObjects[i] = new Circle("GREEN", 100 * random());
            } else {
//                shapeObjects[i] = new Triangle("BLACK", 100 * random(), 100 * random(), 100*random());
                shapeObjects[i] = new Triangle("Black", 9, 9, 9);
            }
        }
        double sumArea = 0;
        double sumRectArea = 0;
        double sumCircleArea = 0;
        double sumTriangleArea = 0;

        for (Shape element : shapeObjects) {
            System.out.print(element.toString());
            System.out.println(", area is " + element.calculateArea());
            sumArea += element.calculateArea();
            if (element instanceof Rectangle) {
                sumRectArea += element.calculateArea();
            } else if (element instanceof Circle) {
                sumCircleArea += element.calculateArea();
            } else {
                sumTriangleArea += element.calculateArea();
            }
        }
        System.out.println("Total area of the shapes is " + sumArea);
        System.out.println("Rectangles total area is " + sumRectArea);
        System.out.println("Circles total area is " + sumCircleArea);
        System.out.println("Triangle total area is " + sumTriangleArea);
    }
}

