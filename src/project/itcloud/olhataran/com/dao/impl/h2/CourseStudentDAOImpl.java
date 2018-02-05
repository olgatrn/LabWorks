package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.CourseStudentDAO;
import project.itcloud.olhataran.com.model.Course;
import project.itcloud.olhataran.com.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseStudentDAOImpl extends DatabaseConnector implements CourseStudentDAO {

    @Override
    public boolean addStudentToCourse(Student student, Course course) throws SQLException {
        boolean result;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(ADD_EXISTING_STUDENT_TO_COURSE)) {
            ps.setInt(1, student.getId());
            ps.setInt(2, course.getId());
            result = ps.execute();
        }
        return result;
    }

    @Override
    public boolean removeStudentFromCourse(Student student, Course course) throws SQLException {
        boolean result;
        try (Connection connection = getConnection();
             PreparedStatement ps =
                     connection.prepareStatement(REMOVE_EXISTING_STUDENT_FROM_COURSE)) {
            ps.setInt(1, student.getId());
            ps.setInt(2, course.getId());
            result = ps.execute();
        }
        return result;
    }

    @Override
    public List<Student> getStudentsByCourseId(int id) throws SQLException {
        List<Student> students = new ArrayList<>();
        Student student;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(SELECT_STUDENTS_BY_COURSE_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    student = new Student.StudentBuilder(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"))
                            .age(rs.getInt("age"))
                            .build();
                    students.add(student);
                }
            }
        }
        return students;
    }

    @Override
    public List<Course> getCoursesByStudentId(int id) throws SQLException {
        List<Course> courses = new ArrayList<>();
        Course course;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(SELECT_COURSES_BY_STUDENT_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    course = new Course.CourseBuilder(rs.getInt("id"),
                            rs.getString("name")
                    )
                            .build();
                    courses.add(course);
                }
            }
        }
        return courses;
    }
}

