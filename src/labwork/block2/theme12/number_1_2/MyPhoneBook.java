package labwork.block2.theme12.number_1_2;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    public static class PhoneNumber {
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
