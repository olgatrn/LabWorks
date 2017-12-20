package labwork.block2.theme17.lw02;

public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        Thread thread = new Thread(bomb1);
        thread.start();
    }
}
