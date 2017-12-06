package labwork213_1_2_3.com.brainacad.oop.testenum1;

import java.util.Arrays;

public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static MyDayOfWeek nextDay(MyDayOfWeek initialDay) throws NullPointerException {
        MyDayOfWeek[] arrayOfDays = MyDayOfWeek.values();
        int indexOfInitialDay = Arrays.binarySearch(arrayOfDays, initialDay);
        int indexOfNextDay;
        if (indexOfInitialDay == arrayOfDays.length - 1) {
            indexOfNextDay = 0;
        } else {
            indexOfNextDay = indexOfInitialDay + 1;
        }
        return arrayOfDays[indexOfNextDay];
    }
}
