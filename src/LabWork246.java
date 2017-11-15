class MyPyramid {
    public static void printPyramid(int height) {
        if (height < 1 | height > 9) {
            System.out.println("We need another height!");
        }
        String space = " ";
        for (int numberOfLine = 1; numberOfLine <= height; numberOfLine++) {
            for (int numberOfSpaces = 0; numberOfSpaces <= height - numberOfLine; numberOfSpaces++) {
                System.out.print(space);
            }
            for (int number = 1; number <= numberOfLine; number++) {
                System.out.print(number);
            }
            for (int number = numberOfLine - 1; number >= 1; number--) {
                System.out.print(number);
            }
            for (int numberOfSpaces = 0; numberOfSpaces <= height - numberOfLine; numberOfSpaces++) {
                System.out.print(space);
            }
            System.out.println();
        }
    }
}

public class LabWork246 {
    public static void main(String[] args) {
        final int HEIGHT = 9;
        MyPyramid.printPyramid(HEIGHT);
    }
}
