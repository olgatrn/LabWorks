package project.itcloud.olhataran.com.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Course {
    private enum DaysOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    private enum Mark {
        A, B, C, D, E
    }

    public class StudentMarkForTask {
        private Student student;
        private String task;
        private Mark mark;
    }

    public static class CourseBuilder {
        private static int counter = 1;
        private final int id;
        private final String name;
        private String shortDescription;
        private List<Student> students;
        private Trainer trainer;
        private LocalDate dateOfStart;
        private LocalDate dateOfEnd;
        private Set<DaysOfWeek> daysOfWeek;
        private List<String> tasks;

        public CourseBuilder(String name, LocalDate dateOfStart) {
            this.id = counter++;
            this.name = name;
            this.dateOfStart = dateOfStart;
        }

        public CourseBuilder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public CourseBuilder students(List<Student> students) {
            this.students = students;
            return this;
        }

        public CourseBuilder trainer(Trainer trainer) {
            this.trainer = trainer;
            return this;
        }

        public CourseBuilder dateOfEnd(LocalDate dateOfEnd) {
            this.dateOfEnd = dateOfEnd;
            return this;
        }

        public CourseBuilder daysOfWeek(Set<DaysOfWeek> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }

        public CourseBuilder tasks(List<String> tasks) {
            this.tasks = tasks;
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
    private List<Student> students;
    private Trainer trainer;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;
    private Set<DaysOfWeek> daysOfWeek;
    private List<String> tasks;
    private List<StudentMarkForTask> performanceRegister;

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

    public Set<DaysOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public List<StudentMarkForTask> getPerformanceRegister() {
        return performanceRegister;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", students=" + students +
                ", trainer=" + trainer +
                ", dateOfStart=" + dateOfStart +
                ", dateOfEnd=" + dateOfEnd +
                ", daysOfWeek=" + daysOfWeek +
                ", tasks=" + tasks +
                ", performanceRegister=" + performanceRegister +
                '}';
    }
}



