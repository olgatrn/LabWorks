package labwork2124;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
    public static class MemoryCard {

    }

    public static class SimCard {

    }

    public static class HeadPhones {

    }

    public static class PhoneCharger {

    }

    public static class PhoneBattery {

    }

    public class Camera {

    }

    public class Bluetooth {

    }

    public class PowerOnButton {

    }

    public class PhoneDisplay {

    }

    public class PhoneSpeaker {

    }

    public class MyPhoneBook {
        public class PhoneNumber {
            private String name;
            private String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "Name: " + name + ", phone: " + phone;
            }
        }

        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

        public void addPhoneNumber(String name, String phone) {
            PhoneNumber phoneNumber = new PhoneNumber(name, phone);
            outer:
            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = phoneNumber;
                    break outer;
                }
            }
        }

        public void printPhoneBook() {
            for (PhoneNumber element : phoneNumbers) {
                System.out.println(element);
            }
        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
        }

        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.phone.compareTo(o2.phone);
                }
            });
        }
    }

    public MyPhone() {
    }

    MyPhoneBook myPhoneBook = new MyPhoneBook();

    public void switchOn() {
        System.out.print("Loading PhoneBook records...");
        myPhoneBook.addPhoneNumber("a", "56");
        myPhoneBook.addPhoneNumber("b", "78");
        myPhoneBook.addPhoneNumber("c", "84");
        myPhoneBook.addPhoneNumber("d", "54");
        myPhoneBook.addPhoneNumber("r", "89");
        myPhoneBook.addPhoneNumber("t", "09");
        myPhoneBook.addPhoneNumber("y", "23");
        myPhoneBook.addPhoneNumber("i", "45");
        myPhoneBook.addPhoneNumber("o", "67");
        myPhoneBook.addPhoneNumber("q", "87");
        System.out.println("OK!");
    }

    public void call(int indexOfArray) {
        System.out.print("Calling to ");
        System.out.println(myPhoneBook.phoneNumbers[indexOfArray]);
    }
}
