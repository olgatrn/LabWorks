package project.itcloud.olhataran.com;

import project.itcloud.olhataran.com.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Olha", "Taran").build();
    }
}
