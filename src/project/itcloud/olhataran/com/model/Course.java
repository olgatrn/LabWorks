package project.itcloud.olhataran.com.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {

    private enum Mark {
        A, B, C, D, E
    }

    private class PerformanceRegister {
        private class StudentMarkForTask {
            Student student;
            Mark mark;
            String task;
        }

        private List<StudentMarkForTask> studentMarksForTasks = new ArrayList<>();
    }

    public static class CourseBuilder {
        private static int counter = 1;
        private final int id;
        private final String name;
        private String shortDescription;
        private List<Student> students = new ArrayList<>();
        private Trainer trainer;
        private LocalDate dateOfStart;
        private LocalDate dateOfEnd;
        private DayOfWeek[] daysOfWeek;
        private List<String> tasks = new ArrayList<>();

        public CourseBuilder(String name) {
            this.id = counter++;
            this.name = name;
        }

        public CourseBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public CourseBuilder shortDescription(String shortDescription) {
            if (this.shortDescription == null) {
                this.shortDescription = shortDescription;
            }
            return this;
        }

        public CourseBuilder students(List<Student> students) {
            if (this.students.isEmpty()) {
                this.students = students;
            }
            return this;
        }

        public CourseBuilder trainer(Trainer trainer) {
            if (this.trainer == null) {
                this.trainer = trainer;
            }
            return this;
        }

        public CourseBuilder dateOfEnd(LocalDate dateOfEnd) {
            if (this.dateOfEnd == null) {
                this.dateOfEnd = dateOfEnd;
            }
            return this;
        }

        public CourseBuilder dateOfStart(LocalDate dateOfStart) {
            if (this.dateOfStart == null) {
                this.dateOfStart = dateOfStart;
            }
            return this;
        }

        public CourseBuilder daysOfWeek(DayOfWeek[] daysOfWeek) {
            if (this.daysOfWeek == null) {
                this.daysOfWeek = daysOfWeek;
            }
            return this;
        }

        public CourseBuilder tasks(List<String> tasks) {
            if (this.tasks.isEmpty()) {
                this.tasks = tasks;
            }
            return this;
        }

        public Course build() {
            Course course = new Course(this);
            return course;
        }
    }

    private final int id;
    private final String name;
    private String shortDescription;
    private List<Student> students = new ArrayList<>();
    private Trainer trainer;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;
    private DayOfWeek[] daysOfWeek;
    private List<String> tasks = new ArrayList<>();
    private PerformanceRegister performanceRegister;

    public Course(CourseBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.shortDescription = builder.shortDescription;
        this.students = builder.students;
        this.trainer = builder.trainer;
        this.dateOfStart = builder.dateOfStart;
        this.dateOfEnd = builder.dateOfEnd;
        this.daysOfWeek = builder.daysOfWeek;
        this.tasks = builder.tasks;
    }

    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    public boolean addTask(String task) {
        tasks.add(task);
        return true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public DayOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public PerformanceRegister getPerformanceRegister() {
        return performanceRegister;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public void setDaysOfWeek(DayOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public void setPerformanceRegister(PerformanceRegister performanceRegister) {
        this.performanceRegister = performanceRegister;
    }

    @Override
    public String toString() {
        return "Course - " + name +
                "\nid: " + id +
                ",\nshort description: " + shortDescription +
                ",\ndate of start: " + dateOfStart +
                ",\ndate of end: " + dateOfEnd +
                ",\ndays of week: " + Arrays.toString(daysOfWeek) +
                ",\ntrainer: " + (trainer != null? trainer.getFirstName() + " " + trainer.getLastName() : trainer) +
                "\n\n";
    }
}



