package practices.threads.sleep;

public class Main {
    public static void main(String[] args) {
        System.out.println("MainTest method started");
        Thread thread = new Thread(new MyTestRunnable());
        thread.start();
        System.out.println("Thread started");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("MainTest method ended");
    }
}
