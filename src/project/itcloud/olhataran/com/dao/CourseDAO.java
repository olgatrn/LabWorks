package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.Course;

import java.sql.SQLException;
import java.util.List;

public interface CourseDAO {
    boolean add(Course course) throws SQLException;

    //TODO
    //boolean deleteById(int id) throws SQLException;

    Course getById(int id) throws SQLException;

    List<Course> getAll() throws SQLException;

    //TODO
    //boolean updateById(int id) throws SQLException;
}
