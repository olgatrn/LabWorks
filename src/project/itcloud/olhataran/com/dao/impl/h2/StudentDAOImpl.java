package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.StudentDAO;
import project.itcloud.olhataran.com.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl extends DatabaseConnector implements StudentDAO {

    public StudentDAOImpl() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean add(Student student) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(INSERT_STUDENT)) {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getFirstName());
            ps.setString(3, student.getLastName());
            ps.setInt(4, student.getAge());
            return ps.execute();
        }
    }

    @Override
    public Student getById(int id) throws SQLException {
        Student student = null;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(SELECT_STUDENT_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    student = new Student.StudentBuilder(rs.getString("first_name"),
                            rs.getString("last_name")).age(rs.getInt("age")).build();
                    // TODO
                    // addition of the list of courses
                }
            }
        }
        return student;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        try (Connection connection = getConnection();
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(SELECT_ALL_STUDENTS)) {
            while (rs.next()) {
                Student student = new Student.StudentBuilder(rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"))
                        .age(rs.getInt("age"))
                        .build();
                students.add(student);
            }
        }
        return students;
    }
}