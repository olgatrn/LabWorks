package practices.threads.synch;

public class UserAccount {
    private int money;

    public UserAccount(int money) {
        this.money = money;
    }

    public int get() {
        return money;
    }

    public void set(int money) {
        this.money = money;
    }
}
