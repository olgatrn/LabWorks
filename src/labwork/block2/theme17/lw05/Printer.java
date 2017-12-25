package labwork.block2.theme17.lw05;

public class Printer extends Thread {
    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            System.out.println(storage.getInteger());
            storage.notify();
        }
    }
}

