package labwork.block2.theme16.number02;

public class Main {
    public static void foo(int i) {
        System.out.println("int");
    }

    public static void foo(Byte b) {
        System.out.println("Byte");
    }

    public static void main(String[] args) {
        byte b = 0;
        Main.foo(b);
    }
}
