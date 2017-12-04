package labwork2113.com.brainacad.oop.testexcp1;

public class InvalidAgeException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid age";
    }
}
