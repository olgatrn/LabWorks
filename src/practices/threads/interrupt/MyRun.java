package practices.threads.interrupt;

import static java.lang.Thread.sleep;

public class MyRun implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName() + " i = " + i++);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
