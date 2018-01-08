package practices.threads.vol;

public class VolatileTest {
    private static volatile int varVlt = 0;
    private static int varNonVlt = 0;

    public static void main(String[] args) {
        ChangeListener th1 = new ChangeListener();
        ChangeMaker th2 = new ChangeMaker();
        th1.start();
        th2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.interrupt();
        th2.interrupt();
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {
            int localValue = 0;
            while (!isInterrupted()) {
                varVlt = varNonVlt = ++localValue;
            }
        }
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                if (varVlt != varNonVlt) {
                    System.out.printf("Error:%d>%d \n", varVlt, varNonVlt);
                }
            }
        }
    }
}
