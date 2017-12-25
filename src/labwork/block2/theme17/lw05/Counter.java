package labwork.block2.theme17.lw05;

public class Counter extends Thread {
    Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i <= 1_000_000; i++) {
                storage.setInteger(i);
                new Printer(storage).start();
                try {
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
