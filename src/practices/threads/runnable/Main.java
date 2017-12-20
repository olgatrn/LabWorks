package practices.threads.runnable;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyTestRunnable());
        thread.start();
    }
}
