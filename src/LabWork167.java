import java.util.Arrays;
import java.util.Scanner;

public class LabWork167 {
    public static void main(String[] args){
        int[][] array = {{1, 1, 1, 3, 4},
                            {2, 1, 3, 1, 2},
                            {2, 2, 3, 4, 1},
                            {3, 3, 3, 1, 4}};

        int numberToSearchFor = 1;

        for (int row = 0; row < array.length; row++) {
            int indexOfLastFoundNumber = 0;
            System.out.print("Line " + (row + 1) + ": [");
            for (int column = 0; column < array[row].length; column++) {

                if (array[row][column] == numberToSearchFor) {
                    if (column == 0 | (column - indexOfLastFoundNumber) > 1) {
                        System.out.print(column + ", ");
                    } else if ((column - indexOfLastFoundNumber) == 1) {
                        System.out.print("-");
                    }
                }
                indexOfLastFoundNumber = column + 1;
            }
            System.out.println("]");
        }

//        System.out.print("Please enter the number we're looking for: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int numberOfEqualValues = 0;
//
//        for (int row = 0; row < myArray.length; row++) {
//            for (int column = 0; column < myArray[row].length; column++ ) {
//                if (myArray[row][column] == number) {
//                    numberOfEqualValues++;
//                }
//            }
//        }
//        System.out.println(numberOfEqualValues);
//
//        int[][] coordinatesOfNumberInArray = new int[numberOfEqualValues][2];
//        int rowOfCoordinatesOfNumberInArray = 0;
//        int columnOfCoordinatesOfNumberInArray = 0;
//
//        for (int row = 0; row < myArray.length; row++) {
//            for (int column = 0; column < myArray[row].length; column++ ) {
//                if (myArray[row][column] == number) {
//                  coordinatesOfNumberInArray[rowOfCoordinatesOfNumberInArray][columnOfCoordinatesOfNumberInArray] = row;
//                  columnOfCoordinatesOfNumberInArray++;
//                  coordinatesOfNumberInArray[rowOfCoordinatesOfNumberInArray][columnOfCoordinatesOfNumberInArray] = column;
//                  rowOfCoordinatesOfNumberInArray++;
//                  columnOfCoordinatesOfNumberInArray = 0;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(coordinatesOfNumberInArray[0]));
//        System.out.println(Arrays.toString(coordinatesOfNumberInArray[1]));
//        System.out.println(Arrays.toString(coordinatesOfNumberInArray[2]));
//        System.out.println(Arrays.toString(coordinatesOfNumberInArray[3]));
//        System.out.println(Arrays.toString(coordinatesOfNumberInArray[4]));
//        System.out.println(Arrays.toString(coordinatesOfNumberInArray[5]));
//        System.out.println(Arrays.toString(coordinatesOfNumberInArray[6]));



//        int[] m = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14, 25, 101, 316, 10};
//        System.out.println(Arrays.toString(m));
// System.out.println("Line " + (row + 1) + ": " + "[" + column + "]");


    }
}