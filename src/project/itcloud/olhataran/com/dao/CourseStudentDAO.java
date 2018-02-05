package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.Course;
import project.itcloud.olhataran.com.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface CourseStudentDAO {

    boolean addStudentToCourse(Student student, Course course) throws SQLException;

    List<Course> getCoursesByStudentId(int id) throws SQLException;

    List<Student> getStudentsByCourseId(int id) throws SQLException;

    boolean removeStudentFromCourse(Student student, Course course) throws SQLException;
}
