package project.itcloud.olhataran.com.model;

import java.util.List;

public class Student {
    public static class StudentBuilder {
        private static int counter = 1;
        private final int id;
        private final String firstName;
        private final String lastName;
        private int age;
        private List<Course> courses;

        public StudentBuilder(String firstName, String lastName) {
            this.id = counter++;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder courses(List<Course> courses) {
            this.courses = courses;
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
    private int age;
    private List<Course> courses;

    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.courses = builder.courses;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
