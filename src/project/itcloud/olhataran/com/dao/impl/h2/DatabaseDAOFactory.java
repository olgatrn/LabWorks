package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.*;

import java.sql.SQLException;

public class DatabaseDAOFactory implements DAOFactory {

    @Override
    public StudentDAO getStudentDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        return new StudentDAOImpl();
    }

    @Override
    public CourseDAO getCourseDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        return new CourseDAOImpl();
    }

    @Override
    public TrainerDAO getTrainerDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        return new TrainerDAOImpl();
    }

    @Override
    public CourseStudentDAO getCourseStudentDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        return new CourseStudentDAOImpl();
    }

    @Override
    public UserDAO getUserDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        return new UserDAOImpl();
    }
}
