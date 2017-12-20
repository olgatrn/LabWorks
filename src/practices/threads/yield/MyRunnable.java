package practices.threads.yield;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            if (Thread.currentThread().getName().equals("TestYield")) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + " " + i++);
        }
    }
}
