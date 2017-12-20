package practices.threads.interrupt;

public class Main {
    public static void main(String[] args) {
        Thread th = new Thread(new MyRun());
        th.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th.interrupt();
    }
}
