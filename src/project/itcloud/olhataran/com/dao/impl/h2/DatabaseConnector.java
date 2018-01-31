package project.itcloud.olhataran.com.dao.impl.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    protected final static String DRIVER_NAME = "org.h2.Driver";
    protected final static String DB_URL = "jdbc:h2:mem:test";
    protected final static String DB_USERNAME = "";
    protected final static String DB_PASSWORD = "";

    protected static final String CREATE_COURSES_TABLE = "CREATE TABLE courses (" +
            "id int(8), " +
            "name varchar(50), " +
            "short_description varchar(250), " +
            "trainer_id int(8), " +
            "foreign key (trainer_id) references trainers(id) on delete cascade, " +
            "date_of_start varchar(50), " +
            "date_of_end varchar(50), " +
            "days_of_week varchar(65), " +
            "tasks varchar(480), " +
            "PRIMARY KEY(id)" +
            ")";

    protected static final String CREATE_STUDENTS_TABLE = "CREATE TABLE students (" +
            "id int(8), " +
            "first_name varchar(50), " +
            "last_name varchar(50), " +
            "age int(8), " +
            "PRIMARY KEY(id)" +
            ")";

    protected static final String CREATE_TRAINERS_TABLE = "CREATE TABLE trainers (" +
            "id int(8), " +
            "first_name varchar(50), " +
            "last_name varchar(50), " +
            "PRIMARY KEY(id)" +
            ")";

    protected static final String INSERT_COURSE =
            "INSERT INTO courses (id, name, short_description, trainer_id, date_of_start varchar, date_of_end, days_of_week, tasks) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    protected static final String INSERT_STUDENT =
            "INSERT INTO students (id, first_name, last_name, age) VALUES (?, ?, ?, ?)";

    protected static final String INSERT_TRAINER =
            "INSERT INTO trainers (id, first_name, last_name) VALUES (?, ?, ?)";

    protected static final String SELECT_ALL_COURSES =
            "SELECT * FROM courses";

    protected static final String SELECT_COURSE_BY_ID =
            "SELECT * FROM courses WHERE courses.id = ?";

    protected static final String SELECT_STUDENT_BY_ID =
            "SELECT * FROM students WHERE students.id = ?";

    protected static final String SELECT_TRAINER_BY_ID =
            "SELECT * FROM trainers WHERE trainers.id = ?";

    protected DatabaseConnector() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        Class.forName(DRIVER_NAME).newInstance();
        createTables();
    }

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    protected void createTables() throws SQLException {
        getConnection().createStatement().execute(CREATE_TRAINERS_TABLE);
        getConnection().createStatement().execute(CREATE_STUDENTS_TABLE);
        getConnection().createStatement().execute(CREATE_COURSES_TABLE);
    }
}
