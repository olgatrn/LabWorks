class Employee1 {
    String firstName;
    String lastName;
    String occupation;
    int telephone;
    static int numberOfEmployees = 0;

    public Employee1() {
        numberOfEmployees++;
    }

    public Employee1(String firstName, String lastName, int telephone) {
        this(firstName, lastName, "engineer", telephone);
    }

    public Employee1(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

}

public class LabWork244_1 {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1();
        Employee1 employee2 = new Employee1("John", "Smith", 987654321);
        Employee1 employee3 = new Employee1("Ivan", "Petrov", "artist", 123456789);
        System.out.println(Employee1.numberOfEmployees);
    }
}
