package labwork265.mycalc.com.brainacad.calc;

import labwork265.mycalc.com.brainacad.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(7, 2, 1);
        Triangle triangle2 = new Triangle(5, 4, 3);
        System.out.println(triangle1.getArea());
        System.out.println(triangle2.getArea());
    }
}
