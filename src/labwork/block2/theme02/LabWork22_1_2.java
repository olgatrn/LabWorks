package labwork.block2.theme02;

import java.util.Arrays;

class Matrix {
    public int[][] addMatrices(int[][] matrixToAdd1, int[][] matrixToAdd2) {

        int[][] resultOfAdditionMatrix;

        if (matrixToAdd1 == null | matrixToAdd1 == null | matrixToAdd1.length != matrixToAdd2.length) {
            System.out.println("Addition is impossible.");
            return resultOfAdditionMatrix = null;
        }

        for (int row = 0; row < matrixToAdd1.length; row++) {
            if (matrixToAdd1[row].length != matrixToAdd1[0].length | matrixToAdd2[row].length != matrixToAdd1[0].length) {
                System.out.println("Addition is impossible.");
                return resultOfAdditionMatrix = null;
            }
        }

        resultOfAdditionMatrix = new int[matrixToAdd1.length][matrixToAdd1[0].length];

        for (int row = 0; row < matrixToAdd1.length; row++) {
            for (int column = 0; column < matrixToAdd1[row].length; column++) {
                resultOfAdditionMatrix[row][column] = matrixToAdd1[row][column] + matrixToAdd2[row][column];
            }
            System.out.println(Arrays.toString(resultOfAdditionMatrix[row]));
        }
        return resultOfAdditionMatrix;
    }

    public int[][] multiplyMatrices(int[][] matrixMultiplier1, int[][] matrixMultiplier2) {

        int[][] resultMatrix;

        if (matrixMultiplier1 == null | matrixMultiplier1 == null) {
            System.out.println("Multiplication is impossible.");
            return resultMatrix = null;
        }

        for (int row = 1; row < matrixMultiplier1.length; row++) {
            if (matrixMultiplier1[row].length != matrixMultiplier1[0].length) {
                System.out.println("Multiplication is impossible.");
                return resultMatrix = null;
            }
        }

        for (int row = 1; row < matrixMultiplier2.length; row++) {
            if (matrixMultiplier2[row].length != matrixMultiplier2[0].length) {
                System.out.println("Multiplication is impossible.");
                return resultMatrix = null;
            }
        }

        if (matrixMultiplier1.length != matrixMultiplier2[0].length) {
            System.out.println("Multiplication is impossible.");
            return resultMatrix = null;
        }

        resultMatrix = new int[matrixMultiplier1.length][matrixMultiplier2[0].length];

        for (int rowOfMatrixMultiplier1 = 0;
             rowOfMatrixMultiplier1 < matrixMultiplier1.length;
             rowOfMatrixMultiplier1++) {
            for (int columnOfMatrixMultiplier2 = 0;
                 columnOfMatrixMultiplier2 < matrixMultiplier2[rowOfMatrixMultiplier1].length;
                 columnOfMatrixMultiplier2++) {
                for (int rowOfMatrixMultiplier2 = 0;
                     rowOfMatrixMultiplier2 < matrixMultiplier2.length;
                     rowOfMatrixMultiplier2++) {
                    resultMatrix[rowOfMatrixMultiplier1][columnOfMatrixMultiplier2] +=
                            matrixMultiplier1[rowOfMatrixMultiplier1][rowOfMatrixMultiplier2]*
                                    matrixMultiplier2[rowOfMatrixMultiplier2][columnOfMatrixMultiplier2];
                }
            }
            System.out.println(Arrays.toString(resultMatrix[rowOfMatrixMultiplier1]));
        }
        return resultMatrix;
    }
}

public class LabWork22_1_2 {
    public static void main(String... args) {
        Matrix matrix = new Matrix();

        int[][] matrix1 = {{1, 2, 3},
                           {3, 4, 9}};
        int[][] matrix2 = {{5, 6},
                           {5, 1},
                           {1, 2}};

//        int[][] matrix2 = {{5, 6},
//                           {7, 6}};
//        int[][] matrix2 = {{5, 6},
//                           {9, 0}};

        matrix.addMatrices(matrix1, matrix2);
        matrix.multiplyMatrices(matrix1, matrix2);
    }
}
