package labwork212_1_2.com.brainacad.oop.testnest1;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Ivan", "12345");
        myPhoneBook.addPhoneNumber("Il\'ya", "67890");
        myPhoneBook.addPhoneNumber("Igor", "13579");
        myPhoneBook.addPhoneNumber("Ippolit", "24680");
        myPhoneBook.addPhoneNumber("Idiot", "09876");
        myPhoneBook.printPhoneBook();
        myPhoneBook.addPhoneNumber("Lilu", "12345");
        myPhoneBook.addPhoneNumber("Lida", "45678");
        myPhoneBook.addPhoneNumber("Lena", "34567");
        myPhoneBook.addPhoneNumber("Lusya", "23456");
        myPhoneBook.addPhoneNumber("Lyalya", "87654");
        myPhoneBook.printPhoneBook();
        System.out.println("**********************************************");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();
        System.out.println("**********************************************");
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();
    }
}
