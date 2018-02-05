package project.itcloud.olhataran.com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class Converter {
    public static String convertArrayDayOfWeekToString(DayOfWeek[] daysOfWeek) {
        String result = "";
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (i == daysOfWeek.length - 1) {
                result = result.concat(daysOfWeek[i].toString());
            } else {
                result = result.concat(String.format("%s, ", daysOfWeek[i].toString()));
            }
        }
        return result;
    }

    public static String convertListTasksToString(List<String> tasks) {
        String result = "";
        for (int i = 0; i < tasks.size(); i++) {
            if (i == tasks.size() - 1) {
                result = result.concat(tasks.get(i));
            } else {
                result = result.concat(String.format("%s, ", tasks.get(i)));
            }
        }
        return result;
    }

    public static LocalDate convertStringToLocalDate(String date) {
        LocalDate localDate = null;
        if (date.matches("20[0-9]{2}-" +
                "((0[1-9])|(1[0-2]))-" +
                "((0[1-9])|(1[0-9])|(2[1-9]|3[0-1]))")) {
            localDate = LocalDate.of(Integer.valueOf(date.substring(0, 4)),
                    Integer.valueOf(date.substring(5, 7)),
                    Integer.valueOf(date.substring(8)));
        } else {
            System.out.println("Can't convert the string to date");
        }
        return localDate;
    }

    public static DayOfWeek[] convertStringToArrayDayOfWeek(String stringDaysOfWeek) {
        DayOfWeek[] daysOfWeek = null;
        if (stringDaysOfWeek.matches("((SUNDAY|MONDAY|TUESDAY|WEDNESDAY|THURSDAY|FRIDAY|SATURDAY), )*" +
                "(SUNDAY|MONDAY|TUESDAY|WEDNESDAY|THURSDAY|FRIDAY|SATURDAY)")) {
            String[] temp = stringDaysOfWeek.split(", ");
            daysOfWeek = new DayOfWeek[temp.length];
            for (int i = 0; i < daysOfWeek.length; i++) {
                daysOfWeek[i] = DayOfWeek.valueOf(temp[i]);
            }
        } else {
            System.out.println("Can't convert the string to array of DayOfWeek");
        }
        return daysOfWeek;
    }

    //TODO
    //convertStringToListOfTasks

    public static <T> String listToString(List<T> list) {
        String result = "";
        for (T t : list) {
            result = result.concat(t.toString());
        }
        return result;
    }
}
