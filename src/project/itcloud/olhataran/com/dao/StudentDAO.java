package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    boolean add(Student student) throws SQLException;

    //TODO
    //boolean deleteById(int id) throws SQLException;

    Student getById(int id) throws SQLException;

    List<Student> getAll() throws SQLException;

    //TODO
    //boolean updateById(int id) throws SQLException;
}
