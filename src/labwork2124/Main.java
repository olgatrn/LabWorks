package labwork2124;

public class Main {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        MyPhone.MyPhoneBook myPhoneBook = myPhone.new MyPhoneBook();
        myPhone.switchOn();
        myPhone.call(1);
    }
}
