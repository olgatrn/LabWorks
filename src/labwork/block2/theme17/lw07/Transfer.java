package labwork.block2.theme17.lw07;

public class Transfer {
    private Bank bank;
    private int from;
    private int max;

    public Transfer(Bank bank, int from, int maxAmount) {
        this.bank = bank;
        this.from = from;
        this.max = maxAmount;
    }
}
