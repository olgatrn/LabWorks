package practices.threads.thread;

public class MyTestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + getName() + " i = " + i);
        }
    }
}
