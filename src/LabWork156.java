import java.util.Scanner;

public class LabWork156 {
    public static void main(String[] args){
        System.out.print("Please enter the number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int numberOfDigitsInNumber = 1;
        int remainderByDivisionByPowerOfTen;

        for (int a = 10; ; a *= 10) {
            remainderByDivisionByPowerOfTen = number % a;
            if (remainderByDivisionByPowerOfTen == number) {
                break;
            }
            numberOfDigitsInNumber++;
        }

        int divider = 1;

        for (int i = 1; i < numberOfDigitsInNumber; i++) {
            divider = divider * 10;
        }

        int sumOfSquaresOfDigits = 0;
        int digit;
        int remainder = number;

        for (int i = 1; i <= divider; i++) {
            digit = remainder / divider;
            remainder = remainder - digit * divider;
            sumOfSquaresOfDigits = sumOfSquaresOfDigits + digit * digit;
            divider = divider / 10;
            if (divider == 1) {
                sumOfSquaresOfDigits = sumOfSquaresOfDigits + remainder * remainder;
                break;
            }
        }

        System.out.println("The sum of squares of the number digits: " + sumOfSquaresOfDigits);
    }
}
