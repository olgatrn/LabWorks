package labwork.block2.theme17.lw02;

public class MyTimeBomb implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
    }
}
