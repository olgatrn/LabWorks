package labwork.block2.theme10.number_3_4_5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

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
//            System.out.print(element.toString());
//            System.out.println(", area is " + element.calculateArea());
            element.draw();
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

        //LabWork 2-8-3
        Rectangle[] arrayOfRectangles = new Rectangle[2];
        System.arraycopy(shapeObjects, 0, arrayOfRectangles, 0, 2);
        System.out.println("array of 2 rectangles");
        for (Rectangle element : arrayOfRectangles) {
            element.draw();
        }
        Arrays.sort(arrayOfRectangles);
        System.out.println("array of 2 rectangles sorted by area");
        for (Rectangle element : arrayOfRectangles) {
            element.draw();
        }

        //LabWork 2-8-4
        Rectangle[] arr2 = new Rectangle[6];
        System.out.println("array of 6 rectangles");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new Rectangle("RED", 100 * random(), 100 * random());
            arr2[i].draw();
        }
        Arrays.sort(arr2);
        System.out.println("array of 6 rectangles sorted by area");
        for (Rectangle element : arr2) {
            element.draw();
        }

        //LabWork 2-8-5
        System.out.println("array of shape objects sorted by color");
        Arrays.sort(shapeObjects, new ShapeColorComparator());
        for (Shape element : shapeObjects) {
            element.draw();
        }

        //LabWork 2-10-3, 2-10-4
        System.out.println(Shape.parseShape("Rectangle:RED:10,20").toString());
        System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12").toString());
        System.out.println(Shape.parseShape("Circle:BLACK:10").toString());

        //LabWork 2-10-5
        Scanner scanner = new Scanner(System.in);
        String stringValue = scanner.nextLine();
        int intValue = Integer.parseInt(stringValue);
        Shape[] arrayOfShapes = new Shape[intValue];
        for (int i = 0; i < arrayOfShapes.length; i++) {
            Scanner scannerForElementsOfArray = new Scanner(System.in);
            String stringAboutElement = scanner.nextLine();
            arrayOfShapes[i] = Shape.parseShape(stringAboutElement);
        }
        for (Shape element : arrayOfShapes) {
            element.draw();
        }
    }
}

