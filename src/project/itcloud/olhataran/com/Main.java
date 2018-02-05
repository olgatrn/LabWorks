package project.itcloud.olhataran.com;

import project.itcloud.olhataran.com.dao.*;
import project.itcloud.olhataran.com.model.User;

import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class Main {
    protected static final String INCORRECT_INPUT = "Wrong command, re-enter, please!";
    protected static final String INCORRECT_ID_FOR_COURSE = "There is no course with such ID.";
    protected static final String INCORRECT_ID_FOR_TRAINER = "There is no course with such ID.";
    protected static final String INCORRECT_ID_FOR_STUDENT = "There is no course with such ID.";
    protected static final String ERROR_IN_DB_CONNECT = "Sorry, can't connect to storage.";
    protected static final String PROMPT_FOR_COMMAND = "\nPlease, enter the command:\n>>>";
    protected static final String PROMPT_FOR_LOGIN = "\nEnter the login:\n>>>";
    protected static final String PROMPT_FOR_PASSWORD = "\nEnter the login:\n>>>";

    public static DAOFactory daoFactory = DAOFactory.getInstance();
    public static CourseDAO courseDAO;
    public static TrainerDAO trainerDAO;
    public static StudentDAO studentDAO;
    public static CourseStudentDAO courseStudentDAO;
    public static UserDAO userDAO;

    static {
        try {
            courseDAO = daoFactory.getCourseDAO();
            trainerDAO = daoFactory.getTrainerDAO();
            studentDAO = daoFactory.getStudentDAO();
            courseStudentDAO = daoFactory.getCourseStudentDAO();
            userDAO = daoFactory.getUserDAO();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static String convertArrayDayOfWeekToString(DayOfWeek[] daysOfWeek) {
        String result = "";
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (i == daysOfWeek.length - 1) {
                result = result.concat(daysOfWeek[i].toString());
            } else {
                result = result.concat(String.format("%s, ", daysOfWeek[i].toString()));
            }
        }
        return result;
    }

    public static String convertListTasksToString(List<String> tasks) {
        String result = "";
        for (int i = 0; i < tasks.size(); i++) {
            if (i == tasks.size() - 1) {
                result = result.concat(tasks.get(i));
            } else {
                result = result.concat(String.format("%s, ", tasks.get(i)));
            }
        }
        return result;
    }

    public static LocalDate convertStringToLocalDate(String date) {
        LocalDate localDate = null;
        if (date.matches("20[0-9]{2}-" +
                "((0[1-9])|(1[0-2]))-" +
                "((0[1-9])|(1[0-9])|(2[1-9]|3[0-1]))")) {
            localDate = LocalDate.of(Integer.valueOf(date.substring(0, 4)),
                    Integer.valueOf(date.substring(5, 7)),
                    Integer.valueOf(date.substring(8)));
        } else {
            System.out.println("Can't convert the string to date");
        }
        return localDate;
    }

    public static DayOfWeek[] convertStringToArrayDayOfWeek(String stringDaysOfWeek) {
        DayOfWeek[] daysOfWeek = null;
        if (stringDaysOfWeek.matches("((SUNDAY|MONDAY|TUESDAY|WEDNESDAY|THURSDAY|FRIDAY|SATURDAY), )*" +
                "(SUNDAY|MONDAY|TUESDAY|WEDNESDAY|THURSDAY|FRIDAY|SATURDAY)")) {
            String[] temp = stringDaysOfWeek.split(", ");
            daysOfWeek = new DayOfWeek[temp.length];
            for (int i = 0; i < daysOfWeek.length; i++) {
                daysOfWeek[i] = DayOfWeek.valueOf(temp[i]);
            }
        } else {
            System.out.println("Can't convert the string to array of DayOfWeek");
        }
        return daysOfWeek;
    }

    //TODO
    //convertStringToListOfTasks

    public static <T> String listToString(List<T> list) {
        String result = "";
        for (T t : list) {
            result = result.concat(t.toString());
        }
        return result;
    }

    public static boolean[] initializeUser(String login, String password) throws SQLException {
        boolean isInitialized = false;
        boolean isAdmin = false;
        User currentUser = userDAO.getByLogin(login);
        if (currentUser != null) {
            isInitialized = true;
            isAdmin = currentUser.isAdmin();
        }
        return new boolean[]{isInitialized, isAdmin};
    }

    protected static void showTrainerById(int id) {

    }

    protected static void showStudentById(int id) {

    }

    protected static void showCourseById(int id) {

    }

    protected static void showStudentsByCourseId(int id) {

    }

    protected static void showTrainers() {

    }

    protected static void showCourses() {

    }

    protected static void showStudents() {

    }

    protected static boolean createCourse() {
        return false;
    }

    protected static boolean createTrainer() {
        return false;
    }

    protected static boolean createStudent() {
        return false;
    }

    protected static boolean addStudentToCourse(int studentId, int courseId) {
        return false;
    }

    protected static boolean removeStudentFromCourse(int studentId, int courseId) {
        return false;
    }
}
