package labwork.block2.theme17.lw07_08;

import java.util.Random;

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Random random = new Random();
        for (int i = 0; i < N_ACCOUNTS; i++) {
            Thread thread = new Thread(new Transfer(bank, i, random.nextInt(INIT_BALANCE)));
            thread.start();
        }
    }
}
