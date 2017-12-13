package practices.threads.sleep;

import practices.threads.runnable.MyTestRunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");
        MyTestRunnable myTestRunnable = new MyTestRunnable();
        Thread thread = new Thread(myTestRunnable);
        thread.start();
        System.out.println("Thread started");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main method ended");
    }
}
