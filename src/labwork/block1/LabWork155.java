package labwork.block1;

import java.util.Scanner;

public class LabWork155 {
    public static void main(String[] args){
        System.out.print("Please enter the upper bound number n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        float avg;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        avg = (float) sum/n;
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
    }
}
