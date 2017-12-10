package labwork.block2.theme14.number_2_3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[10];
        Double[] array2 = new Double[10];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(1000);
            array2[i] = random.nextDouble() * 100;
        }
        System.out.println("Array values:\n" +
                Arrays.toString(array1) +
                "\nNumber of elements that are greater than 500:\n" +
                MyTestMethod.calculateNumber(array1, 500) +
                "\nSum of elements that are greater than 500: \n" +
                MyTestMethod.calculateSum(array1, 500));
        System.out.println("Array values:\n" +
                Arrays.toString(array2) +
                "\nNumber of elements that are greater than 50:\n" +
                MyTestMethod.calculateNumber(array2, 50) +
                "\nSum of elements that are greater than 50: \n" +
                MyTestMethod.calculateSum(array2, 50)
        );
    }
}
