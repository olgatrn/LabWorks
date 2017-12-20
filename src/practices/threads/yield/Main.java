package practices.threads.yield;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunnable());
        th1.setName("TestYield");
        Thread th2 = new Thread(new MyRunnable());
        th2.setName("Thread2");
        th1.start();
        th2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.interrupt();
        th2.interrupt();
    }
}
