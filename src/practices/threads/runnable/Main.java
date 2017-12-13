package practices.threads.runnable;

public class Main {
    public static void main(String[] args) {
        MyTestRunnable myTestRunnable = new MyTestRunnable();
        Thread thread = new Thread(myTestRunnable);
        thread.start();
    }
}
