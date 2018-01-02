package labwork.block2.theme17.lw07_08;

import java.util.Random;

public class Transfer implements Runnable {
    private Bank bank;
    private int from;
    private int max;

    public Transfer(Bank bank, int from, int maxAmount) {
        this.bank = bank;
        this.from = from;
        this.max = maxAmount;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            bank.transfer(from, random.nextInt(bank.getNumberAccounts()), random.nextInt(max));
        }
    }
}
