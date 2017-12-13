package labwork.block2.theme16.number05;

public class Main {
    public static void foo(int i) {
        System.out.println("int");
    }

    public static void foo(byte b) {
        System.out.println("byte");
    }

    public static void main(String[] args) {
        byte b = 5;
        Main.foo(b);
        Main.foo(5);
    }
}
