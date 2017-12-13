package labwork.block2.theme16.number04;

public class Main {
    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void foo(Puppy p) {
        System.out.println("Puppy");
    }

    public static void main(String[] args) {
        Main.foo(null);
    }
}
