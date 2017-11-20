package labwork27_1_2_3_5;

public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new Device("xxx", 8.7f, "yyy");
        devices[1] = new Monitor("aaa", 5.6f, "bbb", 123, 456);
        devices[2] = new EthernetAdapter("aaa", 5.6f, "bbb", 789, "ccc");
        for (Device element : devices) {
            System.out.println(element.toString());
        }
    }
}
