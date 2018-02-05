package project.itcloud.olhataran.com.model;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    public static class TrainerBuilder {
        private static int counter = 1;
        private final int id;
        private final String firstName;
        private final String lastName;
        private List<Course> courses = new ArrayList<>();

        public TrainerBuilder(String firstName, String lastName) {
            this.id = counter++;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public TrainerBuilder(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public TrainerBuilder listOfCourses(List<Course> listOfCourses) {
            if (this.courses.isEmpty()) {
                this.courses = listOfCourses;
            }
            return this;
        }

        public Trainer build() {
            Trainer trainer = new Trainer(this);
            return trainer;
        }
    }

    private final int id;
    private final String firstName;
    private final String lastName;
    private List<Course> courses = new ArrayList<>();

    private Trainer(TrainerBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.courses = builder.courses;
    }

    public boolean addCourse(Course course) {
        courses.add(course);
        return true;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Course> getListOfCourses() {
        return courses;
    }

    public void setListOfCourses(List<Course> listOfCourses) {
        this.courses = listOfCourses;
    }

    @Override
    public String toString() {
        return "Trainer - " + firstName + " " + lastName +
                "\nid: " + id + "\n\n";
    }
}
