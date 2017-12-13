package labwork.block2.theme16.number01;

public class Main {
    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Main.foo(a);
    }
}
