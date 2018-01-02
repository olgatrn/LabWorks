package labwork.block2.theme17.lw09;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_THREADS = 3;
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        MyObject myObject3 = new MyObject();
        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            MyThread myThread = new MyThread(i, myObject1, myObject2, myObject3);
            myThread.start();
        }
    }
}
