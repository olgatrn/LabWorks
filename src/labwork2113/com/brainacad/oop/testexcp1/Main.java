package labwork2113.com.brainacad.oop.testexcp1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(125);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age. The age will be set to 120.");
            try {
                person.setAge(120);
            } catch (InvalidAgeException x) {
            }
        }
        System.out.println(person.getAge());
    }
}
