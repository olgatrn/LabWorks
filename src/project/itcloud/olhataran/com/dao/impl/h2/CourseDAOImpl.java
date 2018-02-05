package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.Main;
import project.itcloud.olhataran.com.dao.CourseDAO;
import project.itcloud.olhataran.com.model.Course;
import project.itcloud.olhataran.com.model.Trainer;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl extends DatabaseConnector implements CourseDAO {

    public CourseDAOImpl() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean add(Course course) throws SQLException {
        boolean result = false;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(INSERT_COURSE)) {
            ps.setInt(1, course.getId());
            ps.setString(2, course.getName());
            ps.setString(3, course.getShortDescription());
            ps.setInt(4, course.getTrainer() != null ? course.getTrainer().getId() : 0);
            ps.setString(5, course.getDateOfStart() != null ?
                    course.getDateOfStart().format(DateTimeFormatter.ISO_LOCAL_DATE) : null);
            ps.setString(6, course.getDateOfEnd() != null ?
                    course.getDateOfEnd().format(DateTimeFormatter.ISO_LOCAL_DATE) : null);
            ps.setString(7, course.getDaysOfWeek() != null ?
                    Main.convertArrayDayOfWeekToString(course.getDaysOfWeek()) : null);
            ps.setString(8, Main.convertListTasksToString(course.getTasks()));
            result = ps.execute();
        }
        return result;
    }

    @Override
    public Course getById(int id) throws SQLException {
        Course course = null;
        Trainer trainer = null;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(SELECT_COURSE_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    if (rs.getInt("trainer_id") != 0) {
                        trainer = new Trainer.TrainerBuilder(rs.getInt("trainer_id"),
                                rs.getString("first_name"),
                                rs.getString("last_name"))
                                .build();
                    }
                    course = new Course.CourseBuilder(rs.getInt("id"),
                            rs.getString("name"))
                            .shortDescription(rs.getString("short_description"))
                            .trainer(trainer)
                            .dateOfStart(Main.convertStringToLocalDate(rs.getString("date_of_start")))
                            .dateOfEnd(Main.convertStringToLocalDate(rs.getString("date_of_end")))
                            .daysOfWeek(Main.convertStringToArrayDayOfWeek(rs.getString("days_of_week")))
//                      TODO
//                    .tasks
                            .build();
                }
                return course;
            }
        }
    }

    public List<Course> getAll() throws SQLException {
        List<Course> courses = new ArrayList();
        Trainer trainer;
        try (Connection connection = getConnection();
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(SELECT_ALL_COURSES)) {
            while (rs.next()) {
                if (rs.getInt("trainer_id") != 0) {
                    trainer = new Trainer.TrainerBuilder(rs.getInt("trainer_id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"))
                            .build();
                } else {
                    trainer = null;
                }
                Course course = new Course.CourseBuilder(rs.getInt("id"),
                        rs.getString("name"))
                        .shortDescription(rs.getString("short_description"))
                        .trainer(trainer)
                        .dateOfStart(Main.convertStringToLocalDate(rs.getString("date_of_start")))
                        .dateOfEnd(Main.convertStringToLocalDate(rs.getString("date_of_end")))
                        .daysOfWeek(Main.convertStringToArrayDayOfWeek(rs.getString("days_of_week")))
//                    TODO
//                    .tasks
                        .build();
                courses.add(course);
            }
            return courses;
        }
    }
}


