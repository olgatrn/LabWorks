package labwork.block2.theme16.number03;

import java.util.Arrays;

public class Main {
    public static void foo (int a, int b){
        System.out.printf("a: %d b: %d%n", a, b);
    }

    public static void foo (int... a){
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int integer1 = 1;
        int integer2 = 2;
        int integer3 = 3;
        Main.foo(integer1, integer2);
        Main.foo(integer1, integer2, integer3);
    }
}
