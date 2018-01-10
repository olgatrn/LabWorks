package project.itcloud.com.olhataran.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Course {
    private enum DaysOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    private class PerformanceRegister {
        //sublist of Tasks - show only the Course we need
    }

    private int id;
    private String name;
    private String shortDescription;
    private List<Student> students;
    private Trainer trainer;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;
    private Set<DaysOfWeek> daysOfWeek;
    private PerformanceRegister performanceRegister;
}
