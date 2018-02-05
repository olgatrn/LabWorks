package project.itcloud.olhataran.com.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static class StudentBuilder {
        private static int counter = 1;
        private final int id;
        private final String firstName;
        private final String lastName;
        private int age = 0;
        private List<Course> courses = new ArrayList<>();

        public StudentBuilder(String firstName, String lastName) {
            this.id = counter++;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StudentBuilder(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StudentBuilder age(int age) {
            if (this.age == 0) {
                this.age = age;
            }
            return this;
        }

        public StudentBuilder courses(List<Course> courses) {
            if (this.courses.isEmpty()) {
                this.courses = courses;
            }
            return this;
        }

        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }

    private final int id;
    private final String firstName;
    private final String lastName;
    private int age = 0;
    private List<Course> courses = new ArrayList<>();

    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
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

    public int getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student - " + firstName + " " + lastName +
                "\nid: " + id +
                ",\nage: " + age + "\n\n";
    }
}
