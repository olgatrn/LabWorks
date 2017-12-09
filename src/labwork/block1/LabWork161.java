package labwork.block1;

import java.util.Arrays;

public class LabWork161 {
    public static void main(String[] args){
        int numberOfValues = 0;
        int index = 0;

        for (int i = 2; i <= 30; i++) {
            if (i%2 == 0) {
                numberOfValues++;
            }
        }

        int[] myArray = new int[numberOfValues];

        for (int i = 2; i <= 30; i++) {
            if (i%2 == 0) {
                myArray [index] = i;
                index++;
            }
        }

        System.out.println(Arrays.toString(myArray));
    }
}
