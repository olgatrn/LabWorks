package labwork.block2.theme17.lw03;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(myArray));
        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(myArray.length - 1);
        mySumCount1.setArray(myArray);
        mySumCount2.setStartIndex(0);
        mySumCount2.setStopIndex(myArray.length - 1);
        mySumCount2.setArray(myArray);
        mySumCount1.start();
        mySumCount2.start();
        try {
            mySumCount1.join();
            mySumCount2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of array elements in thread 1: " + mySumCount1.getResultSum());
        System.out.println("Sum of array elements in thread 2: " + mySumCount2.getResultSum());
    }
}
