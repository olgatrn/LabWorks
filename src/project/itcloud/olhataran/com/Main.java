package project.itcloud.olhataran.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Converter.convertArrayDayOfWeekToString(new DayOfWeek[]{}));
        System.out.println(Converter.convertStringToLocalDate("2019-07-12"));
        System.out.println(Arrays.toString(Converter.convertStringToArrayDayOfWeek("MONDAY, TUESDAY")));

    }
}
