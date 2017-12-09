package labwork.block2.theme02;

class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

    public void setFieldOfPerson(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public void setFieldOfPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFieldOfPerson(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setFieldOfPerson(String lastName, int age, int phoneNumber) {
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void setFieldOfPerson(String lastName, int phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}

public class LabWork224 {
    public static void main(String... args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        person1.setFieldOfPerson("Olga", "Taran", 25, "female", 12345);
        person2.setFieldOfPerson("Xxx", "Yyy", 27 );
        person3.setFieldOfPerson("Tom", "Smith", "male");
        person4.setFieldOfPerson("Lee", 23, 78905);
        person5.setFieldOfPerson("Ivanov", 5674);
        }
}
