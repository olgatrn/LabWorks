package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.StudentDAO;
import project.itcloud.olhataran.com.model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAOImpl extends DatabaseConnector implements StudentDAO {

    public StudentDAOImpl() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean addStudent(Student student) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_STUDENT);
            ps.setInt(1, student.getId());
            ps.setString(2, student.getFirstName());
            ps.setString(3, student.getLastName());
            ps.setInt(4, student.getAge());
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Student getStudentById(int id) {
        Student student = null;
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(SELECT_STUDENT_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student.StudentBuilder(rs.getString("first_name"),
                        rs.getString("last_name")).age(rs.getInt("age")).build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // TODO
        // addition of the list of courses

        return student;
    }
}
