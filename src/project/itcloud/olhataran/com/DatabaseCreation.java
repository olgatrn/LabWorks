package project.itcloud.olhataran.com;

import project.itcloud.olhataran.com.dao.*;
import project.itcloud.olhataran.com.dao.impl.h2.DatabaseConnector;
import project.itcloud.olhataran.com.model.Course;
import project.itcloud.olhataran.com.model.Student;
import project.itcloud.olhataran.com.model.Trainer;
import project.itcloud.olhataran.com.model.User;

import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DatabaseCreation extends DatabaseConnector {
    public static void main(String[] args) {
        try {
            Class.forName(DRIVER_NAME).newInstance();
        } catch (Exception e) {
//            System.out.println("Sorry, database can not be created.");
            e.printStackTrace();
        }
        try {
            createTables();
        } catch (SQLException e) {
//            System.out.println("Sorry, error during tables creation.");
            e.printStackTrace();
        }
        DAOFactory daoFactory = DAOFactory.getInstance();
        CourseDAO courseDAO;
        TrainerDAO trainerDAO;
        StudentDAO studentDAO;
        CourseStudentDAO courseStudentDAO;
        UserDAO userDAO;
        try {
            courseDAO = daoFactory.getCourseDAO();
            trainerDAO = daoFactory.getTrainerDAO();
            studentDAO = daoFactory.getStudentDAO();
            courseStudentDAO = daoFactory.getCourseStudentDAO();
            userDAO = daoFactory.getUserDAO();

            trainerDAO.add(new Trainer.TrainerBuilder("Ivan", "Ivanov")
                    .build());
            trainerDAO.add(new Trainer.TrainerBuilder("Boris", "Borisov")
                    .build());
            trainerDAO.add(new Trainer.TrainerBuilder("Petr", "Petrov")
                    .build());
            trainerDAO.add(new Trainer.TrainerBuilder("Denis", "Denisov")
                    .build());
            trainerDAO.add(new Trainer.TrainerBuilder("Alexey", "Alexeev")
                    .build());
            studentDAO.add(new Student.StudentBuilder("Fedor", "Fedorov")
                    .age(25)
                    .build());
            studentDAO.add(new Student.StudentBuilder("Maxim", "Maximov")
                    .age(26)
                    .build());
            studentDAO.add(new Student.StudentBuilder("Andrey", "Andreev")
                    .age(27)
                    .build());
            studentDAO.add(new Student.StudentBuilder("Luka", "Lukyanov")
                    .age(28)
                    .build());
            studentDAO.add(new Student.StudentBuilder("Semyon", "Semyonov")
                    .age(29)
                    .build());
            courseDAO.add(new Course.CourseBuilder("Learning Java")
                    .shortDescription("some description about learning Java is here")
                    .dateOfStart(LocalDate.of(2018, 2, 5))
                    .dateOfEnd(LocalDate.of(2018, 5, 8))
                    .daysOfWeek(new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY})
                    .trainer(trainerDAO.getById(1))
                    .build());
            courseDAO.add(new Course.CourseBuilder("Learning .Net")
                    .shortDescription("some description about .Net is here")
                    .dateOfStart(LocalDate.of(2018, 6, 5))
                    .dateOfEnd(LocalDate.of(2018, 8, 2))
                    .daysOfWeek(new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.SATURDAY})
                    .trainer(trainerDAO.getById(2))
                    .build());
            courseDAO.add(new Course.CourseBuilder("Business Analysis")
                    .shortDescription("some description about business analysis is here")
                    .dateOfStart(LocalDate.of(2019, 2, 5))
                    .dateOfEnd(LocalDate.of(2018, 7, 8))
                    .daysOfWeek(new DayOfWeek[]{DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY})
                    .trainer(trainerDAO.getById(3))
                    .build());
            courseDAO.add(new Course.CourseBuilder("Learning Front-end")
                    .shortDescription("some description about front-end is here")
                    .dateOfStart(LocalDate.of(2018, 3, 5))
                    .dateOfEnd(LocalDate.of(2018, 6, 8))
                    .daysOfWeek(new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.SUNDAY})
                    .trainer(trainerDAO.getById(4))
                    .build());
            courseDAO.add(new Course.CourseBuilder("Learning QA")
                    .shortDescription("some description about QA is here")
                    .dateOfStart(LocalDate.of(2018, 4, 5))
                    .dateOfEnd(LocalDate.of(2018, 7, 8))
                    .daysOfWeek(new DayOfWeek[]{DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY})
                    .trainer(null)
                    .build());
            userDAO.add(new User("user", "user", false));
            userDAO.add(new User("admin", "admin", true));

            System.out.println(Converter.listToString(courseDAO.getAll()));
            System.out.println(Converter.listToString(trainerDAO.getAll()));
            System.out.println(Converter.listToString(studentDAO.getAll()));
        } catch (Exception e) {
//            System.out.println("Sorry, can't continue.");
            e.printStackTrace();
        }
    }
}
