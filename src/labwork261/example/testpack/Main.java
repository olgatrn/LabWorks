package labwork261.example.testpack;

import labwork261.example.applepack.Apple;
import labwork261.com.brainacad.carpack.Car;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Car car = new Car();
        System.out.println(apple.getWeight());
        System.out.println(car.getWeight());
    }
}
