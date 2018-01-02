package labwork.block2.theme17.lw07_08;

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

//    public int[] getAccounts() {
//        return accounts;
//    }

    synchronized void transfer(int from, int to, int amount) {
        try {
            System.out.println("from: " + from + " to: " + to +
                    " amount: " + amount);

            if (accounts[from] < amount) {
                return;
            }
            accounts[from] -= amount;
            Thread.sleep((int) (100 * Math.random()));
            accounts[to] += amount;

            System.out.println("Total balance: " + getTotalBalance());
        } catch (InterruptedException e) {
        }
    }

    public int getTotalBalance() {
        int total = 0;
        for (int account : accounts) {
            total += account;
        }
        return total;
    }

    public int getNumberAccounts() {
        return numOfAccounts;
    }
}

