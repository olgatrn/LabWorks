package practices.threads.runnable;

public class MyTestRunnable implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++){
            System.out.println("Thread " + name + " i " + i);
        }
    }
}
