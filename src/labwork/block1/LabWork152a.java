package labwork.block1;

import java.util.Scanner;

public class LabWork152a {
    public static void main(String[] args){
        System.out.print("Please enter the number x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String output;
        if (x == 1) {
            output = "One";
        } else if (x == 2) {
            output = "Two";
        } else if (x == 3) {
            output = "Three";
        } else if (x == 4) {
            output = "Four";
        } else if (x == 5) {
            output = "Five";
        } else if (x == 6) {
            output = "Six";
        } else if (x == 7) {
            output = "Seven";
        } else if (x == 8) {
            output = "Eight";
        } else if (x == 9) {
            output = "Nine";
        } else {
            output = "Other";
        }
        System.out.println(output);
    }
}
