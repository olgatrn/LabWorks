package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.Student;

public interface StudentDAO {
    boolean addStudent(Student student);

    Student getStudentById(int id);
}
