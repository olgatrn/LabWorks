package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.CourseDAO;
import project.itcloud.olhataran.com.model.Course;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl extends DatabaseConnector implements CourseDAO {

    public CourseDAOImpl() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean addCourse(Course course) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_COURSE);
            ps.setInt(1, course.getId());
            ps.setString(2, course.getName());
            ps.setString(3, course.getShortDescription());
            ps.setInt(4, course.getTrainer().getId());
            ps.setString(5, course.getDateOfStart().format(DateTimeFormatter.ISO_DATE));
            ps.setString(6, course.getDateOfEnd().format(DateTimeFormatter.ISO_DATE));
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

    public List<Person> getAll() {
        List<Person> result = new ArrayList();
        Statement st = null;

        try {
            st = this.getConnection().createStatement();
            st.execute("SELECT * FROM person");
            ResultSet resultSet = st.getResultSet();

            while(resultSet.next()) {
                Person person = new Person(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"));
                result.add(person);
            }
        } catch (SQLException var13) {
            var13.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException var12) {
                var12.printStackTrace();
                return null;
            }
        }

        return result;
    }

}
