package labwork.block2.theme04;

class MyMath {
    private final static double PI = 3.14;

    public static double areaOfCircle(double radius) {
        double areaOfCircle = PI * radius * radius;
        return areaOfCircle;
    }

    public static int findMin(int[] arrayOfValues) {
        if (arrayOfValues == null) {
            return 0;
        }
        int minValue = arrayOfValues[0];
        for (int element : arrayOfValues) {
            if (element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    public static int findMax(int[] arrayOfValues) {
        if (arrayOfValues == null) {
            return 0;
        }
        int maxValue = arrayOfValues[0];
        for (int element : arrayOfValues) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }
}

public class LabWork24_1_2_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10, 12};
        System.out.println(MyMath.findMin(array1));
        System.out.println(MyMath.findMax(array2));
        System.out.println("The area of circle with radius 5.25 is " + MyMath.areaOfCircle(5.25));
    }
}

