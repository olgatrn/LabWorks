package practices.threads.waitnotify;

public class DataSender extends Thread {
    MyTestData data;
    String user;

    public DataSender(MyTestData doc, String user) {
        this.data = doc;
        this.user = user;
    }

    public void run() {
        System.out.println("Waiting for Data #" + getId() + "...");
        synchronized (data) {
            try {
                while (!data.ready()) {
                    data.wait();
                }
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println("Sending data to " + user);
    }
}