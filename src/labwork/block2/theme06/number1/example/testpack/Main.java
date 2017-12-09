package labwork.block2.theme06.number1.example.testpack;

import labwork.block2.theme06.number1.example.applepack.Apple;
import labwork.block2.theme06.number1.carpack.Car;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Car car = new Car();
        System.out.println(apple.getWeight());
        System.out.println(car.getWeight());
    }
}
