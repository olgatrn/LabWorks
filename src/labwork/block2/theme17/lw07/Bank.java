package labwork.block2.theme17.lw07;

public class Bank {
    private int accounts[];
    private int numOfAccounts;

    public Bank(int numOfAccounts, int initialBalance) {
        accounts = new int[numOfAccounts];
        this.numOfAccounts = numOfAccounts;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initialBalance;
        }
    }

    void transfer(int from, int to, int amount) {
        try {
            System.out.println("from: " + from + " to: " + to +
                    " amount: " + amount);

            if (accounts[from] < amount) {
                return;
            }
            accounts[from] = -amount;
            Thread.sleep((int) (100 * Math.random()));
            accounts[to] = accounts[to] + amount;

            System.out.println("Total balance: " + totalBalance());
        } catch (InterruptedException e) {
        }
    }

    public int totalBalance() {
        int total = 0;
        for (int v : accounts) {
            total = total + v;
        }
        return total;
    }

    public int getNumberAccounts() {
        return numOfAccounts;
    }
}

