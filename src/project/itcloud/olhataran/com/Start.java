package project.itcloud.olhataran.com;

import java.sql.SQLException;
import java.util.Scanner;

public class Start extends Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputCommand;
        String[] elementsOfInput;
        String login;
        String password;
        boolean initialisationInProcess = true;
        boolean isAdmin;
        while (true) {
            do {
                System.out.print(PROMPT_FOR_LOGIN);
                login = sc.nextLine();
                System.out.print(PROMPT_FOR_PASSWORD);
                password = sc.nextLine();
                boolean[] resultOfInitialisation = new boolean[0];
                try {
                    resultOfInitialisation = initializeUser(login, password);
                } catch (SQLException e) {
                    System.out.println("Error during initializing.");
                }
                if (resultOfInitialisation[0]) {
                    initialisationInProcess = false;
                    isAdmin = resultOfInitialisation[1];
                }
            } while (initialisationInProcess);

            System.out.print(PROMPT_FOR_COMMAND);
            inputCommand = sc.nextLine();
            elementsOfInput = inputCommand.toLowerCase().split(" ");
            switch (elementsOfInput[0]) {
                case "show":
                    switch (elementsOfInput[1]) {
                        case "courses":
                            showCourses();
                            break;
                        case "trainers":
                            showTrainers();
                            break;
                        case "students":
                            if (elementsOfInput.length > 2) {
                                int id;
                                try {
                                    id = Integer.parseInt(elementsOfInput[2]);
                                    showStudentsByCourseId(id);
                                } catch (NumberFormatException e) {
                                    System.out.println(INCORRECT_ID_FOR_COURSE);
                                }
                            } else {
                                showStudents();
                            }
                            break;
                        case "course":
                            if (elementsOfInput.length > 2) {
                                int id;
                                try {
                                    id = Integer.parseInt(elementsOfInput[2]);
                                    showCourseById(id);
                                } catch (NumberFormatException e) {
                                    System.out.println(INCORRECT_ID_FOR_COURSE);
                                }
                            } else {
                                System.out.println(INCORRECT_ID_FOR_COURSE);
                            }
                            break;
                        case "trainer":
                            if (elementsOfInput.length > 2) {
                                int id;
                                try {
                                    id = Integer.parseInt(elementsOfInput[2]);
                                    showTrainerById(id);
                                } catch (NumberFormatException e) {
                                    System.out.println(INCORRECT_ID_FOR_TRAINER);
                                }
                            } else {
                                System.out.println(INCORRECT_ID_FOR_TRAINER);
                            }
                            break;
                        case "student":
                            if (elementsOfInput.length > 2) {
                                int id;
                                try {
                                    id = Integer.parseInt(elementsOfInput[2]);
                                    showStudentById(id);
                                } catch (NumberFormatException e) {
                                    System.out.println(INCORRECT_ID_FOR_STUDENT);
                                }
                            } else {
                                System.out.println(INCORRECT_ID_FOR_STUDENT);
                            }
                            break;
                        default:
                            System.out.println(INCORRECT_INPUT);
                    }
                    break;
                case "create":
                    switch (elementsOfInput[1]) {
                        case "course":
                            createCourse();
                            break;
                        case "trainer":
                            createTrainer();
                            break;
                        case "student":
                            createStudent();
                            break;
                        default:
                            System.out.println(INCORRECT_INPUT);
                    }
                    break;
                case "transfer":
                    switch (elementsOfInput[1]) {
                        case "student":
                            if (elementsOfInput.length > 3) {
                                try {
                                    int studentId = Integer.parseInt(elementsOfInput[2]);
                                    int courseId = Integer.parseInt(elementsOfInput[4]);
                                    switch (elementsOfInput[3]) {
                                        case "add":
                                            addStudentToCourse(studentId, courseId);
                                            break;
                                        case "remove":
                                            removeStudentFromCourse(studentId, courseId);
                                            break;
                                        default:
                                            System.out.println(INCORRECT_INPUT);
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println(INCORRECT_INPUT);
                                }
                            } else {
                                System.out.println(INCORRECT_INPUT);
                            }
                            break;
                        default:
                            System.out.println(INCORRECT_INPUT);
                    }
                    break;
                case "exit":
                    sc.close();
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
            }
        }
    }
}
