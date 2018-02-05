package project.itcloud.olhataran.com.dao.impl.h2;

import java.sql.*;

public class DatabaseConnector {
    protected final static String DRIVER_NAME = "org.h2.Driver";
    protected final static String DB_URL = "jdbc:h2:./localdatabase";
    protected final static String DB_USERNAME = "";
    protected final static String DB_PASSWORD = "";

    protected static final String CREATE_COURSE_TABLE = "CREATE TABLE course (" +
            "id int(8), " +
            "name varchar(50), " +
            "short_description varchar(250), " +
            "trainer_id int(8), " +
//            "foreign key (trainer_id) references trainer(id) on delete cascade, " +
            "date_of_start varchar(50), " +
            "date_of_end varchar(50), " +
            "days_of_week varchar(65), " +
            "tasks varchar(480), " +
            "PRIMARY KEY(id)" +
            ")";

    protected static final String CREATE_STUDENT_TABLE = "CREATE TABLE student (" +
            "id int(8), " +
            "first_name varchar(50), " +
            "last_name varchar(50), " +
            "age int(8), " +
            "PRIMARY KEY(id)" +
            ")";

    protected static final String CREATE_TRAINER_TABLE = "CREATE TABLE trainer (" +
            "id int(8), " +
            "first_name varchar(50), " +
            "last_name varchar(50), " +
            "PRIMARY KEY(id)" +
            ")";

    protected static final String CREATE_USER_TABLE = "CREATE TABLE user (" +
            "login varchar(50), " +
            "password varchar(50), " +
            "isAdmin int(1), " +
            "PRIMARY KEY(login)" +
            ")";

    protected static final String CREATE_COURSE_STUDENT_TABLE = "CREATE TABLE course_student (" +
            "student_id int(8) references student(id), " +
            "course_id int(8) references course(id), " +
            "PRIMARY KEY (student_id, course_id), " +
            ")";

    protected static final String ADD_EXISTING_STUDENT_TO_COURSE =
            "INSERT INTO student_course (student_id, course_id) VALUES (?, ?)";

    protected static final String INSERT_COURSE =
            "INSERT INTO course (id, name, short_description, trainer_id, date_of_start, date_of_end, days_of_week, tasks) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    protected static final String INSERT_STUDENT =
            "INSERT INTO student (id, first_name, last_name, age) VALUES (?, ?, ?, ?)";

    protected static final String INSERT_TRAINER =
            "INSERT INTO trainer (id, first_name, last_name) VALUES (?, ?, ?)";

    protected static final String INSERT_USER =
            "INSERT INTO user (login, password, isAdmin) VALUES (?, ?, ?)";

    protected static final String REMOVE_EXISTING_STUDENT_FROM_COURSE =
            "DELETE FROM student_course WHERE student_id = ? AND course_id = ?";

    protected static final String SELECT_ALL_COURSES =
            "SELECT * FROM course LEFT JOIN trainer ON course.trainer_id = trainer.id";

    protected static final String SELECT_COURSE_BY_ID =
            "SELECT * FROM course " +
                    "LEFT JOIN trainer ON course.trainer_id = trainer.id " +
                    "WHERE course.id = ?";

    protected static final String SELECT_COURSE_BY_NAME =
            "SELECT * FROM course WHERE course.name = ?";

    protected static final String SELECT_COURSES_BY_STUDENT_ID =
            "SELECT * FROM course LEFT JOIN student_course " +
                    "ON course.id = student_course.course_id " +
                    "WHERE student_id = ? ORDER BY id";

    protected static final String SELECT_COURSES_BY_TRAINER_ID =
            "SELECT * FROM course WHERE course.trainer_id = ?";

    protected static final String SELECT_ALL_STUDENTS =
            "SELECT * FROM student";

    protected static final String SELECT_STUDENTS_BY_COURSE_ID =
            "SELECT * FROM student LEFT JOIN student_course " +
                    "ON student.id = student_course.student_id " +
                    "WHERE course_id = ? ORDER BY id";

    protected static final String SELECT_STUDENT_BY_ID =
            "SELECT * FROM student WHERE student.id = ?";

    protected static final String SELECT_STUDENT_BY_NAME =
            "SELECT * FROM student " +
                    "WHERE student.first_name = ? AND student.last_name = ?";

    protected static final String SELECT_ALL_TRAINERS =
            "SELECT * FROM trainer";

    protected static final String SELECT_TRAINER_BY_ID =
            "SELECT * FROM trainer WHERE trainer.id = ?";

    protected static final String SELECT_USER_BY_LOGIN =
            "SELECT * FROM user WHERE user.login = ?";

    protected static final String SELECT_TRAINER_BY_NAME =
            "SELECT * FROM trainer " +
                    "WHERE trainer.first_name = ? AND trainer.last_name = ?";

    protected static final String UPDATE_COURSE =
            "UPDATE course SET name = ?, " +
                    "short_description = ?, " +
                    "trainer_id = ?, " +
                    "date_of_start = ?, " +
                    "date_of_end = ?, " +
                    "days_of_week = ?, " +
                    "tasks = ? " +
                    "WHERE id = ?";

//    protected DatabaseConnector() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
//        Class.forName(DRIVER_NAME).newInstance();
//    }

    protected static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    protected static void createTables() throws SQLException {
        Connection connection = getConnection();
        connection.createStatement().execute(CREATE_TRAINER_TABLE);
        connection.createStatement().execute(CREATE_STUDENT_TABLE);
        connection.createStatement().execute(CREATE_COURSE_TABLE);
        connection.createStatement().execute(CREATE_USER_TABLE);
        connection.createStatement().execute(CREATE_COURSE_STUDENT_TABLE);
        connection.close();
    }
}
