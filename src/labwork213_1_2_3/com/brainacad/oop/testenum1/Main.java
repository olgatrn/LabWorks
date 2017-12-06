package labwork213_1_2_3.com.brainacad.oop.testenum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek dayOfWeek : MyDayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }

        for (MyDayOfWeek dayOfWeek : MyDayOfWeek.values()) {
            switch (dayOfWeek) {
                case MONDAY:
                    System.out.println("My Java day: " + dayOfWeek);
                    break;
                case WEDNESDAY:
                    System.out.println("My Java day: " + dayOfWeek);
                    break;
                case FRIDAY:
                    System.out.println("My Java day: " + dayOfWeek);
                    break;
                default:
                    break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        MyDayOfWeek dayOfWeek = null;
        try {
            dayOfWeek = MyDayOfWeek.valueOf(line);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong input");
        }
        try {
            System.out.println("The next day is " + MyDayOfWeek.nextDay(dayOfWeek));
        } catch (NullPointerException e) {
            System.out.println("Impossible define");
        }
    }
}
