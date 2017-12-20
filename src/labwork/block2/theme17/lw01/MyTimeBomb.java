package labwork.block2.theme17.lw01;

public class MyTimeBomb extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
    }
}
