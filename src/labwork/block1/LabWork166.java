package labwork.block1;

import java.util.Arrays;

public class LabWork166 {
    public static void main(String[] args){
        int[] myArray1 = new int[] {-12, 12, 0, 4, 12, 27, 23, -17, 18, 0, -1, 0};

        Arrays.sort(myArray1);
        System.out.println(Arrays.toString(myArray1));

        int[] myArray2 = new int[] {-12, 12, 0, 4, 12, 27, 23, -17, 18, 0, -1, 0};
        int numberOfNeg = 0;
        int numberOfZeros = 0;

        for (int element : myArray2) {
            if (element < 0) {
                numberOfNeg++;
            } else if (element == 0) {
                numberOfZeros++;
            }
        }

        for (int i = 0; i < (numberOfNeg + numberOfZeros); i++) {
            if (myArray2[i] > 0) {
                for (int j = (myArray2.length - 1); j >= (numberOfNeg + numberOfZeros); j--) {
                    if (myArray2[j] <= 0) {
                        int myElementNeg = myArray2[j];
                        int myElementPos = myArray2[i];
                        myArray2[i] = myElementNeg;
                        myArray2[j] = myElementPos;
                    }
                }
            }
        }

        for (int i = 0; i < numberOfNeg; i++) {
            if (myArray2[i] == 0) {
                for (int j = (numberOfNeg + numberOfZeros - 1); j >= numberOfNeg; j--) {
                    if (myArray2[j] < 0) {
                        int myElementNeg = myArray2[j];
                        int myElementZero = myArray2[i];
                        myArray2[i] = myElementNeg;
                        myArray2[j] = myElementZero;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(myArray2));
    }
}