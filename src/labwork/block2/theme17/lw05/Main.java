package labwork.block2.theme17.lw05;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        counter.start();
    }
}
