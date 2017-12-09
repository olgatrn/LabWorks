package labwork.block1;

import java.util.Scanner;

public class LabWork157 {
    public static void main(String[] args){
        System.out.print("Please enter the upper number: ");
        Scanner sc = new Scanner(System.in);
        int upperNumber = sc.nextInt();
        int sumOfDivisors = 0;

        for (int a = 1; a <= upperNumber; a++) {

            for (int i = 1; i < a; i++) {
                int resultOfDivision = a % i;

                if (resultOfDivision == 0) {
                    sumOfDivisors = sumOfDivisors + i;
                }
            }

            if (sumOfDivisors == a) {
                System.out.println("Perfect number: " + a);
            }

            sumOfDivisors = 0;
        }
    }
}

