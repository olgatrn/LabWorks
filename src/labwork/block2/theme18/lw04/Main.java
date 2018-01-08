package labwork.block2.theme18.lw04;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] programs = {"notepad.exe",
                "calc.exe"};
        Random random = new Random();
        try {
            Process process = Runtime.getRuntime().exec(programs[random.nextInt(programs.length - 1)]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You can launch notepad or calc, please select: ");
        String programNeeded = new Scanner(System.in).nextLine();
        if (!programNeeded.equals("notepad") & !programNeeded.equals("calc")) {
            System.out.println("There is no program with such name");
        } else {
            StringBuilder sB = new StringBuilder(programNeeded);
            sB = sB.append(".exe");
            try {
                Process process = Runtime.getRuntime().exec(sB.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
