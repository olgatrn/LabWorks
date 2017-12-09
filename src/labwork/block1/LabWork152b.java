package labwork.block1;

import java.util.Scanner;

public class LabWork152b {
    public static void main(String[] args){
        System.out.print("Please enter the number x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String output;
        switch (x) {
            case 1:
                output = "One";
                break;
            case 2:
                output = "Two";
                break;
            case 3:
                output = "Three";
                break;
            case 4:
                output = "Four";
                break;
            case 5:
                output = "Five";
                break;
            case 6:
                output = "Six";
                break;
            case 7:
                output = "Seven";
                break;
            case 8:
                output = "Eight";
                break;
            case 9:
                output = "Nine";
                break;
            default:
                output = "Other";
                break;
        }
        System.out.println(output);
    }
}