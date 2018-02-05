package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.dao.impl.h2.DatabaseDAOFactory;

import java.sql.SQLException;

public interface DAOFactory {
    CourseDAO getCourseDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException;

    CourseStudentDAO getCourseStudentDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException;

    StudentDAO getStudentDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException;

    TrainerDAO getTrainerDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException;

    UserDAO getUserDAO() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException;

    static DatabaseDAOFactory getInstance() {
        return new DatabaseDAOFactory();
    }
}