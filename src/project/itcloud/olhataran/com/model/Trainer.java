package project.itcloud.olhataran.com.model;

import java.util.List;

public class Trainer {
    public static class TrainerBuilder {
        private static int counter = 1;
        private final int id;
        private final String firstName;
        private final String lastName;
        private List<Course> listOfCourses;

        public TrainerBuilder(String firstName, String lastName) {
            this.id = counter++;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public TrainerBuilder listOfCourses(List<Course> listOfCourses) {
            this.listOfCourses = listOfCourses;
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
    private List<Course> listOfCourses;

    private Trainer(TrainerBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.listOfCourses = builder.listOfCourses;
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
        return listOfCourses;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", listOfCourses=" + listOfCourses +
                '}';
    }
}
