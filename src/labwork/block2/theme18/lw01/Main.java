package labwork.block2.theme18.lw01;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(40) + 10;
        System.out.println(n + "! = " + Main.factorial(n));
    }
}
