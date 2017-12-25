package practices.threads.waitnotify;

public class DataGenerator extends Thread {
    MyTestData dat;

    public DataGenerator(MyTestData dat) {
        this.dat = dat;
    }

    public void run() {
        System.out.println("Generating data....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        byte[] data = new byte[1000];
        System.out.println("OK!!!");
        synchronized (dat) {
            dat.setData(data);
            dat.notifyAll();
        }
    }
}
