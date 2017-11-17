package labwork252;

import java.util.Arrays;

class MyInit {
    private int[] array;

    {
        array = new int[10];
        for (int element = 0; element < array.length; element++) {
            array[element] = (int) (100 * Math.random());
        }
    }

    public void printArray() {

//        System.out.println(Arrays.toString(array));

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
